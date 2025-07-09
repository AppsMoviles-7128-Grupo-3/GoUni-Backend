package com.example.gounibackend.domain.repository;

import com.example.gounibackend.domain.model.Route;
import java.util.Optional;
import java.util.List;

public interface RouteRepository {
    Route save(Route route);
    Optional<Route> findById(Long id);
    List<Route> findByUserId(Long userId);
    List<Route> findAll();
    void deleteById(Long id);
} 