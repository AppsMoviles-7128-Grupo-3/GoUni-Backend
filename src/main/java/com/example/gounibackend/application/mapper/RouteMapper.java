package com.example.gounibackend.application.mapper;

import com.example.gounibackend.domain.model.Route;
import com.example.gounibackend.application.dto.RouteDTO;

public class RouteMapper {
    public static RouteDTO toDTO(Route route) {
        RouteDTO dto = new RouteDTO();
        dto.setId(route.getId());
        dto.setUserId(route.getUserId());
        dto.setCarId(route.getCarId());
        dto.setStart(route.getStart());
        dto.setEnd(route.getEnd());
        dto.setDays(route.getDays());
        dto.setDepartureTime(route.getDepartureTime());
        dto.setArrivalTime(route.getArrivalTime());
        dto.setAvailableSeats(route.getAvailableSeats());
        dto.setPrice(route.getPrice());
        dto.setCreatedAt(route.getCreatedAt());
        dto.setUpdatedAt(route.getUpdatedAt());
        return dto;
    }

    public static Route toEntity(RouteDTO dto) {
        Route route = new Route();
        route.setId(dto.getId());
        route.setUserId(dto.getUserId());
        route.setCarId(dto.getCarId());
        route.setStart(dto.getStart());
        route.setEnd(dto.getEnd());
        route.setDays(dto.getDays());
        route.setDepartureTime(dto.getDepartureTime());
        route.setArrivalTime(dto.getArrivalTime());
        route.setAvailableSeats(dto.getAvailableSeats());
        route.setPrice(dto.getPrice());
        route.setCreatedAt(dto.getCreatedAt());
        route.setUpdatedAt(dto.getUpdatedAt());
        return route;
    }
} 