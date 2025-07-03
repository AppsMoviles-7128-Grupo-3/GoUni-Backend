package com.example.gounibackend.application.service;

import com.example.gounibackend.domain.model.User;
import com.example.gounibackend.domain.repository.UserRepository;
import com.example.gounibackend.application.dto.UserDTO;
import com.example.gounibackend.application.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserDTO register(UserDTO dto, String password) {
        User user = UserMapper.toEntity(dto, password);
        User saved = userRepository.save(user);
        return UserMapper.toDTO(saved);
    }

    public UserDTO login(String email, String password) {
        Optional<User> userOpt = userRepository.findByEmail(email);
        if (userOpt.isPresent() && userOpt.get().getPassword().equals(password)) {
            return UserMapper.toDTO(userOpt.get());
        }
        return null;
    }

    public boolean emailExists(String email) {
        return userRepository.findByEmail(email).isPresent();
    }

    public boolean resetPassword(String email, String newPassword) {
        Optional<User> userOpt = userRepository.findByEmail(email);
        if (userOpt.isPresent()) {
            User user = userOpt.get();
            user.setPassword(newPassword);
            userRepository.save(user);
            return true;
        }
        return false;
    }

    public UserDTO edit(Long id, UserDTO dto, String password) {
        Optional<User> userOpt = userRepository.findById(id);
        if (userOpt.isPresent()) {
            User user = userOpt.get();
            user.setName(dto.getName());
            user.setEmail(dto.getEmail());
            user.setUniversity(dto.getUniversity());
            user.setUserCode(dto.getUserCode());

            if (password != null && !password.trim().isEmpty()) {
                user.setPassword(password);
            }
            
            User saved = userRepository.save(user);
            return UserMapper.toDTO(saved);
        }
        return null;
    }

    public UserDTO getById(Long id) {
        return userRepository.findById(id).map(UserMapper::toDTO).orElse(null);
    }
} 