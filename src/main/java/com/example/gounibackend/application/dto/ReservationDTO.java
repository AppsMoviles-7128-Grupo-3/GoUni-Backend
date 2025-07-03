package com.example.gounibackend.application.dto;

public class ReservationDTO {
    private Long id;
    private Long routeId;
    private Long passengerId;
    private String studentName;
    private Integer age;
    private String meetingPlace;
    private String universityId;
    private String profilePhoto;
    private String status;

    public ReservationDTO() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getRouteId() { return routeId; }
    public void setRouteId(Long routeId) { this.routeId = routeId; }
    public Long getPassengerId() { return passengerId; }
    public void setPassengerId(Long passengerId) { this.passengerId = passengerId; }
    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }
    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
    public String getMeetingPlace() { return meetingPlace; }
    public void setMeetingPlace(String meetingPlace) { this.meetingPlace = meetingPlace; }
    public String getUniversityId() { return universityId; }
    public void setUniversityId(String universityId) { this.universityId = universityId; }
    public String getProfilePhoto() { return profilePhoto; }
    public void setProfilePhoto(String profilePhoto) { this.profilePhoto = profilePhoto; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
} 