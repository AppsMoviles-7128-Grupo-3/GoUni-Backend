package com.example.gounibackend.application.dto;

public class ReservationDTO {
    private Long id;
    private Long routeId;
    private Long driverId;
    private Long passengerId;

    public ReservationDTO() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getRouteId() { return routeId; }
    public void setRouteId(Long routeId) { this.routeId = routeId; }
    public Long getDriverId() { return driverId; }
    public void setDriverId(Long driverId) { this.driverId = driverId; }
    public Long getPassengerId() { return passengerId; }
    public void setPassengerId(Long passengerId) { this.passengerId = passengerId; }
} 