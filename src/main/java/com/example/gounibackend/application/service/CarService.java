package com.example.gounibackend.application.service;

import com.example.gounibackend.domain.model.Car;
import com.example.gounibackend.domain.repository.CarRepository;
import com.example.gounibackend.application.dto.CarDTO;
import com.example.gounibackend.application.mapper.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public CarDTO create(CarDTO dto) {
        Car car = CarMapper.toEntity(dto);
        Car saved = carRepository.save(car);
        return CarMapper.toDTO(saved);
    }

    public CarDTO update(Long id, CarDTO dto) {
        Car car = carRepository.findById(id).orElse(null);
        if (car == null) return null;
        car.setMake(dto.getMake());
        car.setModel(dto.getModel());
        car.setLicensePlate(dto.getLicensePlate());
        car.setColor(dto.getColor());
        car.setYear(dto.getYear());
        car.setInsuranceInfo(dto.getInsuranceInfo());
        car.setInsuranceBrand(dto.getInsuranceBrand());
        car.setRegistrationNumber(dto.getRegistrationNumber());
        Car saved = carRepository.save(car);
        return CarMapper.toDTO(saved);
    }

    public void delete(Long id) {
        carRepository.deleteById(id);
    }

    public CarDTO getById(Long id) {
        return carRepository.findById(id).map(CarMapper::toDTO).orElse(null);
    }

    public List<CarDTO> getByUserId(Long userId) {
        return carRepository.findByUserId(userId).stream().map(CarMapper::toDTO).collect(Collectors.toList());
    }
} 