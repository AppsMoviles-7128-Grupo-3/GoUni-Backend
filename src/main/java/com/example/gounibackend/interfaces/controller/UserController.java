package com.example.gounibackend.interfaces.controller;

import com.example.gounibackend.application.dto.UserDTO;
import com.example.gounibackend.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public UserDTO register(@RequestBody UserDTO dto, @RequestParam String password) {
        return userService.register(dto, password);
    }

    @PostMapping("/login")
    public ResponseEntity<UserDTO> login(@RequestParam String email, @RequestParam String password) {
        UserDTO user = userService.login(email, password);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }
    }

    @GetMapping("/forgot-password")
    public String forgotPassword(@RequestParam String email) {
        boolean exists = userService.emailExists(email);
        if (exists) {
            return "Password reset link sent to " + email;
        } else {
            return "Email not found";
        }
    }

    @PostMapping("/reset-password")
    public String resetPassword(@RequestParam String email, @RequestParam String newPassword) {
        boolean success = userService.resetPassword(email, newPassword);
        if (success) {
            return "Password updated successfully";
        } else {
            return "Failed to update password. Email not found.";
        }
    }

    @PutMapping("/{id}")
    public UserDTO edit(@PathVariable Long id, @RequestBody UserDTO dto, @RequestParam(required = false) String password) {
        return userService.edit(id, dto, password);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getById(@PathVariable Long id) {
        UserDTO user = userService.getById(id);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
} 