package com.example.social_network.controller;

import com.example.social_network.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    @GetMapping
    public List<User> findAll() {
        return List.of(
                User.builder().nickname("steve").email("petracho").bio("cool").createAt("12.12.12").build()
        );

    }
}
