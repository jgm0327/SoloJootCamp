package com.example.solojootcamp.user.repository;

import com.example.solojootcamp.user.repository.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
