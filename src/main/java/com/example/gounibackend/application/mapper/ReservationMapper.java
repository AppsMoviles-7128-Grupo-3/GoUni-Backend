package com.example.gounibackend.application.mapper;

import com.example.gounibackend.domain.model.Reservation;
import com.example.gounibackend.application.dto.ReservationDTO;

public class ReservationMapper {
    public static ReservationDTO toDTO(Reservation reservation) {
        ReservationDTO dto = new ReservationDTO();
        dto.setId(reservation.getId());
        dto.setRouteId(reservation.getRouteId());
        dto.setDriverId(reservation.getDriverId());
        dto.setPassengerId(reservation.getPassengerId());
        return dto;
    }

    public static Reservation toEntity(ReservationDTO dto) {
        Reservation reservation = new Reservation();
        reservation.setId(dto.getId());
        reservation.setRouteId(dto.getRouteId());
        reservation.setDriverId(dto.getDriverId());
        reservation.setPassengerId(dto.getPassengerId());
        return reservation;
    }
} 