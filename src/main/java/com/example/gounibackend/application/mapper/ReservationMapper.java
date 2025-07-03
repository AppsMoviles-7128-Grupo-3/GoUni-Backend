package com.example.gounibackend.application.mapper;

import com.example.gounibackend.domain.model.Reservation;
import com.example.gounibackend.application.dto.ReservationDTO;

public class ReservationMapper {
    public static ReservationDTO toDTO(Reservation reservation) {
        ReservationDTO dto = new ReservationDTO();
        dto.setId(reservation.getId());
        dto.setRouteId(reservation.getRouteId());
        dto.setPassengerId(reservation.getPassengerId());
        dto.setStudentName(reservation.getStudentName());
        dto.setAge(reservation.getAge());
        dto.setMeetingPlace(reservation.getMeetingPlace());
        dto.setUniversityId(reservation.getUniversityId());
        dto.setProfilePhoto(reservation.getProfilePhoto());
        dto.setStatus(reservation.getStatus().name());
        return dto;
    }

    public static Reservation toEntity(ReservationDTO dto) {
        Reservation reservation = new Reservation();
        reservation.setId(dto.getId());
        reservation.setRouteId(dto.getRouteId());
        reservation.setPassengerId(dto.getPassengerId());
        reservation.setStudentName(dto.getStudentName());
        reservation.setAge(dto.getAge());
        reservation.setMeetingPlace(dto.getMeetingPlace());
        reservation.setUniversityId(dto.getUniversityId());
        reservation.setProfilePhoto(dto.getProfilePhoto());
        reservation.setStatus(Reservation.Status.valueOf(dto.getStatus()));
        return reservation;
    }
} 