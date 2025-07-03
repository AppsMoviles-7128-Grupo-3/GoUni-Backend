package com.example.gounibackend.application.dto;

public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private String university;
    private String userCode;

    public UserDTO() {}

    public UserDTO(Long id, String name, String email, String university, String userCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.university = university;
        this.userCode = userCode;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getUniversity() { return university; }
    public void setUniversity(String university) { this.university = university; }
    public String getUserCode() { return userCode; }
    public void setUserCode(String userCode) { this.userCode = userCode; }

} 