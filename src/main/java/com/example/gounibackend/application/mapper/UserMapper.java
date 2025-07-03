package com.example.gounibackend.application.mapper;

import com.example.gounibackend.domain.model.User;
import com.example.gounibackend.application.dto.UserDTO;

public class UserMapper {
    public static UserDTO toDTO(User user) {
        return new UserDTO(
            user.getId(),
            user.getName(),
            user.getEmail(),
            user.getUniversity(),
            user.getUserCode()
        );
    }

    public static User toEntity(UserDTO dto, String password) {
        return new User(
            dto.getName(),
            dto.getEmail(),
            password,
            dto.getUniversity(),
            dto.getUserCode()
        );
    }
} 