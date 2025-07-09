package com.example.gounibackend.application.dto;

import java.time.LocalTime;
import java.util.List;

public class RouteDTO {
    private Long id;
    private Long userId;
    private Long carId;
    private String start;
    private String end;
    private List<String> days;
    private LocalTime departureTime;
    private LocalTime arrivalTime;
    private Integer availableSeats;
    private Double price;
    private java.time.LocalDateTime createdAt;
    private java.time.LocalDateTime updatedAt;

    public RouteDTO() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
    public Long getCarId() { return carId; }
    public void setCarId(Long carId) { this.carId = carId; }
    public String getStart() { return start; }
    public void setStart(String start) { this.start = start; }
    public String getEnd() { return end; }
    public void setEnd(String end) { this.end = end; }
    public java.util.List<String> getDays() { return days; }
    public void setDays(java.util.List<String> days) { this.days = days; }
    public java.time.LocalTime getDepartureTime() { return departureTime; }
    public void setDepartureTime(java.time.LocalTime departureTime) { this.departureTime = departureTime; }
    public java.time.LocalTime getArrivalTime() { return arrivalTime; }
    public void setArrivalTime(java.time.LocalTime arrivalTime) { this.arrivalTime = arrivalTime; }
    public Integer getAvailableSeats() { return availableSeats; }
    public void setAvailableSeats(Integer availableSeats) { this.availableSeats = availableSeats; }
    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
    public java.time.LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(java.time.LocalDateTime createdAt) { this.createdAt = createdAt; }
    public java.time.LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(java.time.LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
} 