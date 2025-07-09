package com.example.gounibackend.domain.model;

import jakarta.persistence.*;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "routes")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "car_id", nullable = false)
    private Long carId;

    @Column(nullable = false)
    private String start;

    @Column(nullable = false)
    private String end;

    @ElementCollection
    @CollectionTable(name = "route_days", joinColumns = @JoinColumn(name = "route_id"))
    @Column(name = "day_of_week")
    private List<String> days;

    @Column(name = "departure_time", nullable = false)
    private LocalTime departureTime;

    @Column(name = "arrival_time", nullable = false)
    private LocalTime arrivalTime;

    @Column(name = "available_seats", nullable = false)
    private Integer availableSeats;

    @Column(nullable = false)
    private Double price;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Route() {}

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

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }
} 