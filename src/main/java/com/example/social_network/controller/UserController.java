package com.example.social_network.controller;

import com.example.social_network.model.User;
import com.example.social_network.service.ServiceInterface.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/user")
public class UserController {
    private final UserService userService;
    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }
}
