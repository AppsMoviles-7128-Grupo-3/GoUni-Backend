package com.example.gounibackend.domain.repository;

import com.example.gounibackend.domain.model.Car;
import java.util.Optional;
import java.util.List;

public interface CarRepository {
    Car save(Car car);
    Optional<Car> findById(Long id);
    List<Car> findByUserId(Long userId);
    List<Car> findAll();
    void deleteById(Long id);
} 