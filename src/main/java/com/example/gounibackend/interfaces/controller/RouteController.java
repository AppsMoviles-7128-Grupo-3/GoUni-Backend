package com.example.gounibackend.interfaces.controller;

import com.example.gounibackend.application.dto.RouteDTO;
import com.example.gounibackend.application.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/routes")
public class RouteController {
    @Autowired
    private RouteService routeService;

    @PostMapping
    public RouteDTO create(@RequestBody RouteDTO dto) {
        return routeService.create(dto);
    }

    @PutMapping("/{id}")
    public RouteDTO update(@PathVariable Long id, @RequestBody RouteDTO dto) {
        return routeService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        routeService.delete(id);
    }

    @GetMapping("/{id}")
    public RouteDTO getById(@PathVariable Long id) {
        return routeService.getById(id);
    }

    @GetMapping
    public List<RouteDTO> getAll() {
        return routeService.getAll();
    }

    @GetMapping("/driver/{driverId}")
    public List<RouteDTO> getByDriverId(@PathVariable Long driverId) {
        return routeService.getByDriverId(driverId);
    }
} 