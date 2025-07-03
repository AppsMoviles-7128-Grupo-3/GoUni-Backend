package com.example.gounibackend.application.service;

import com.example.gounibackend.domain.model.Reservation;
import com.example.gounibackend.domain.repository.ReservationRepository;
import com.example.gounibackend.application.dto.ReservationDTO;
import com.example.gounibackend.application.mapper.ReservationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    public ReservationDTO create(ReservationDTO dto) {
        Reservation reservation = ReservationMapper.toEntity(dto);
        Reservation saved = reservationRepository.save(reservation);
        return ReservationMapper.toDTO(saved);
    }

    public ReservationDTO updateStatus(Long id, String status) {
        Reservation reservation = reservationRepository.findById(id).orElse(null);
        if (reservation == null) return null;
        reservation.setStatus(Reservation.Status.valueOf(status));
        Reservation saved = reservationRepository.save(reservation);
        return ReservationMapper.toDTO(saved);
    }

    public List<ReservationDTO> getByRouteId(Long routeId) {
        return reservationRepository.findByRouteId(routeId).stream().map(ReservationMapper::toDTO).collect(Collectors.toList());
    }

    public List<ReservationDTO> getByPassengerId(Long passengerId) {
        return reservationRepository.findByPassengerId(passengerId).stream().map(ReservationMapper::toDTO).collect(Collectors.toList());
    }
} 