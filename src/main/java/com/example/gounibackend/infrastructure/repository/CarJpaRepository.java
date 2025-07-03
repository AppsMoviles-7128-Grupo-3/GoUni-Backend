package com.example.gounibackend.infrastructure.repository;

import com.example.gounibackend.domain.model.Car;
import com.example.gounibackend.domain.repository.CarRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarJpaRepository extends JpaRepository<Car, Long>, CarRepository {
    List<Car> findByUserId(Long userId);
} 