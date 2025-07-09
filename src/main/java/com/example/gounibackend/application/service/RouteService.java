package com.example.gounibackend.application.service;

import com.example.gounibackend.domain.model.Route;
import com.example.gounibackend.domain.repository.RouteRepository;
import com.example.gounibackend.application.dto.RouteDTO;
import com.example.gounibackend.application.mapper.RouteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RouteService {
    @Autowired
    private RouteRepository routeRepository;

    public RouteDTO create(RouteDTO dto) {
        Route route = RouteMapper.toEntity(dto);
        Route saved = routeRepository.save(route);
        return RouteMapper.toDTO(saved);
    }

    public RouteDTO update(Long id, RouteDTO dto) {
        Route route = routeRepository.findById(id).orElse(null);
        if (route == null) return null;
        route.setStart(dto.getStart());
        route.setEnd(dto.getEnd());
        route.setDays(dto.getDays());
        route.setDepartureTime(dto.getDepartureTime());
        route.setArrivalTime(dto.getArrivalTime());
        route.setAvailableSeats(dto.getAvailableSeats());
        route.setPrice(dto.getPrice());
        Route saved = routeRepository.save(route);
        return RouteMapper.toDTO(saved);
    }

    public void delete(Long id) {
        routeRepository.deleteById(id);
    }

    public RouteDTO getById(Long id) {
        return routeRepository.findById(id).map(RouteMapper::toDTO).orElse(null);
    }

    public List<RouteDTO> getAll() {
        return routeRepository.findAll().stream().map(RouteMapper::toDTO).collect(Collectors.toList());
    }

    public List<RouteDTO> getByUserId(Long userId) {
        return routeRepository.findByUserId(userId).stream().map(RouteMapper::toDTO).collect(Collectors.toList());
    }
} 