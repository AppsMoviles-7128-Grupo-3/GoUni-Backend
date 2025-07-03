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

    @PutMapping("/{id}/status")
    public ReservationDTO updateStatus(@PathVariable Long id, @RequestParam String status) {
        return reservationService.updateStatus(id, status);
    }

    @GetMapping("/route/{routeId}")
    public List<ReservationDTO> getByRouteId(@PathVariable Long routeId) {
        return reservationService.getByRouteId(routeId);
    }

    @GetMapping("/passenger/{passengerId}")
    public List<ReservationDTO> getByPassengerId(@PathVariable Long passengerId) {
        return reservationService.getByPassengerId(passengerId);
    }
} 