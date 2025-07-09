package com.example.gounibackend.interfaces.controller;

import com.example.gounibackend.application.dto.ReservationDTO;
import com.example.gounibackend.application.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @PostMapping
    public ReservationDTO create(@RequestBody ReservationDTO dto) {
        return reservationService.create(dto);
    }

    @GetMapping("/route/{routeId}")
    public List<ReservationDTO> getByRouteId(@PathVariable Long routeId) {
        return reservationService.getByRouteId(routeId);
    }

    @GetMapping("/passenger/{passengerId}")
    public List<ReservationDTO> getByPassengerId(@PathVariable Long passengerId) {
        return reservationService.getByPassengerId(passengerId);
    }

    @GetMapping("/driver/{driverId}")
    public List<ReservationDTO> getByDriverId(@PathVariable Long driverId) {
        return reservationService.getByDriverId(driverId);
    }
} 