package com.example.gounibackend.application.dto;

public class CarDTO {
    private Long id;
    private Long userId;
    private String make;
    private String model;
    private String licensePlate;
    private String color;
    private Integer year;
    private String insuranceInfo;
    private String insuranceBrand;
    private String registrationNumber;

    public CarDTO() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public String getLicensePlate() { return licensePlate; }
    public void setLicensePlate(String licensePlate) { this.licensePlate = licensePlate; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public Integer getYear() { return year; }
    public void setYear(Integer year) { this.year = year; }
    public String getInsuranceInfo() { return insuranceInfo; }
    public void setInsuranceInfo(String insuranceInfo) { this.insuranceInfo = insuranceInfo; }
    public String getInsuranceBrand() { return insuranceBrand; }
    public void setInsuranceBrand(String insuranceBrand) { this.insuranceBrand = insuranceBrand; }
    public String getRegistrationNumber() { return registrationNumber; }
    public void setRegistrationNumber(String registrationNumber) { this.registrationNumber = registrationNumber; }
} 