package com.example.social_network.service;

import com.example.social_network.model.User;
import com.example.social_network.service.ServiceInterface.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> findAll() {
        return List.of(
                User.builder().nickname("steve").email("petracho").bio("cool").createAt("12.12.12").build()
        );
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User findUserByNickname(String nickname) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUserByEmail(String email) {

    }
}
