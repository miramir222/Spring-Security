package com.example.service;

import com.example.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User getUser(Long id);

    User createUser(User user);

    User updateUser(User user);

    String deleteUser(Long id);
}
