package com.example.social_network.service.ServiceInterface;

import com.example.social_network.model.User;

import java.util.List;

public interface UserService {
     List<User> findAll();
     User saveUser(User user);
     User findUserByEmail(String nickname);
     User updateUser(User user);
     void deleteUserByEmail(String email);
}
