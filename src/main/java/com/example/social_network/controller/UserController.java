package com.example.social_network.controller;

import com.example.social_network.model.User;
import com.example.social_network.service.ServiceInterface.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("save_user")
    public String saveUser(@RequestBody User user){
        userService.saveUser(user);
        return "User successfully saved";
    }

    @GetMapping("/{email}")
    public User findUserByEmail(@PathVariable("email") String email){
        return userService.findUserByEmail(email);
    }

    @PutMapping("update_user")
    public User updateUser(User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("delete_user/{email}")
    public void deleteUser(@PathVariable("email") String email){
        userService.deleteUserByEmail(email);
    }
}
