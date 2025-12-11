package com.eventplanner.userservice.service;

import com.eventplanner.userservice.dto.LoginRequest;
import com.eventplanner.userservice.dto.RegisterRequest;
import com.eventplanner.userservice.dto.UserResponse;

public interface UserService {
    UserResponse register(RegisterRequest request);
    String login(LoginRequest request);
}
