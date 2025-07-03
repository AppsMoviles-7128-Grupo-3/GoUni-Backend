package com.example.gounibackend.application.mapper;

import com.example.gounibackend.domain.model.Car;
import com.example.gounibackend.application.dto.CarDTO;

public class CarMapper {
    public static CarDTO toDTO(Car car) {
        CarDTO dto = new CarDTO();
        dto.setId(car.getId());
        dto.setUserId(car.getUserId());
        dto.setMake(car.getMake());
        dto.setModel(car.getModel());
        dto.setLicensePlate(car.getLicensePlate());
        dto.setColor(car.getColor());
        dto.setYear(car.getYear());
        dto.setInsuranceInfo(car.getInsuranceInfo());
        dto.setInsuranceBrand(car.getInsuranceBrand());
        dto.setRegistrationNumber(car.getRegistrationNumber());
        return dto;
    }

    public static Car toEntity(CarDTO dto) {
        Car car = new Car();
        car.setId(dto.getId());
        car.setUserId(dto.getUserId());
        car.setMake(dto.getMake());
        car.setModel(dto.getModel());
        car.setLicensePlate(dto.getLicensePlate());
        car.setColor(dto.getColor());
        car.setYear(dto.getYear());
        car.setInsuranceInfo(dto.getInsuranceInfo());
        car.setInsuranceBrand(dto.getInsuranceBrand());
        car.setRegistrationNumber(dto.getRegistrationNumber());
        return car;
    }
} 