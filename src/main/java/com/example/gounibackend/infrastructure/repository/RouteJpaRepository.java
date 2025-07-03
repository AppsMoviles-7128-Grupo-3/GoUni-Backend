package com.example.gounibackend.infrastructure.repository;

import com.example.gounibackend.domain.model.Route;
import com.example.gounibackend.domain.repository.RouteRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteJpaRepository extends JpaRepository<Route, Long>, RouteRepository {
    List<Route> findByDriverId(Long driverId);
} 