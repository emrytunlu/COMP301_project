package com.eventplanner.userservice.service;

import com.eventplanner.userservice.dto.LoginRequest;
import com.eventplanner.userservice.dto.RegisterRequest;
import com.eventplanner.userservice.dto.UserResponse;

public interface UserService {

    UserResponse register(RegisterRequest request);

    String login(LoginRequest request);

    UserResponse updateUser(Long id, RegisterRequest request);

    void deleteUser(Long id);

    UserResponse getCurrentUser(String email);
    UserResponse updateCurrentUser(String email, RegisterRequest request);
    void deleteCurrentUser(String email);

}
