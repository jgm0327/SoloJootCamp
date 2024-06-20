package com.example.solojootcamp.user.service;

import com.example.solojootcamp.user.repository.UserRepository;
import com.example.solojootcamp.user.service.dto.AddUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void signup(AddUser addUser){
        userRepository.save(addUser.of());
    }
}
