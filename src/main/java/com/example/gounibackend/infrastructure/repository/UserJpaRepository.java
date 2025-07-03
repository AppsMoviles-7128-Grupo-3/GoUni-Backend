package com.example.gounibackend.infrastructure.repository;

import com.example.gounibackend.domain.model.User;
import com.example.gounibackend.domain.repository.UserRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserJpaRepository extends JpaRepository<User, Long>, UserRepository {
    Optional<User> findByEmail(String email);
} 