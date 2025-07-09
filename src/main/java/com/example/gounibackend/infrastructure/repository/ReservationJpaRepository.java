package com.example.gounibackend.infrastructure.repository;

import com.example.gounibackend.domain.model.Reservation;
import com.example.gounibackend.domain.repository.ReservationRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationJpaRepository extends JpaRepository<Reservation, Long>, ReservationRepository {
    List<Reservation> findByRouteId(Long routeId);
    List<Reservation> findByPassengerId(Long passengerId);

    @Query("SELECT r.id FROM Route r WHERE r.userId = :driverId")
    List<Long> findAllRouteIdsByDriverId(@Param("driverId") Long driverId);
} 