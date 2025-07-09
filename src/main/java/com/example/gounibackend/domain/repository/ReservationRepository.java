package com.example.gounibackend.domain.repository;

import com.example.gounibackend.domain.model.Reservation;
import java.util.Optional;
import java.util.List;

public interface ReservationRepository {
    Reservation save(Reservation reservation);
    Optional<Reservation> findById(Long id);
    List<Reservation> findByRouteId(Long routeId);
    List<Reservation> findByPassengerId(Long passengerId);
    List<Reservation> findAll();
    void deleteById(Long id);
    List<Long> findAllRouteIdsByDriverId(Long driverId);
} 