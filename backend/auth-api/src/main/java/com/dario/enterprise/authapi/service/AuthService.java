package com.dario.enterprise.authapi.service;

import com.dario.enterprise.authapi.dto.LoginRequest;
import com.dario.enterprise.authapi.dto.RegisterRequest;

public interface AuthService {

    String register(RegisterRequest request);
    String login(LoginRequest request);
}
