package com.example.gounibackend.domain.repository;

import com.example.gounibackend.domain.model.Route;
import java.util.Optional;
import java.util.List;

public interface RouteRepository {
    Route save(Route route);
    Optional<Route> findById(Long id);
    List<Route> findByDriverId(Long driverId);
    List<Route> findAll();
    void deleteById(Long id);
} 