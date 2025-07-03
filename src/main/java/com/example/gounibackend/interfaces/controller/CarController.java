package com.example.gounibackend.interfaces.controller;

import com.example.gounibackend.application.dto.CarDTO;
import com.example.gounibackend.application.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {
    @Autowired
    private CarService carService;

    @PostMapping
    public CarDTO create(@RequestBody CarDTO dto) {
        return carService.create(dto);
    }

    @PutMapping("/{id}")
    public CarDTO update(@PathVariable Long id, @RequestBody CarDTO dto) {
        return carService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        carService.delete(id);
    }

    @GetMapping("/{id}")
    public CarDTO getById(@PathVariable Long id) {
        return carService.getById(id);
    }

    @GetMapping("/user/{userId}")
    public List<CarDTO> getByUserId(@PathVariable Long userId) {
        return carService.getByUserId(userId);
    }
} 