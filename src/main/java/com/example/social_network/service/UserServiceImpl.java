package com.example.social_network.service;

import com.example.social_network.model.User;
import com.example.social_network.repository.UserRepository;
import com.example.social_network.service.ServiceInterface.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return repository.createUser(user);
    }

    @Override
    public User findUserByEmail(String email) {
        return repository.findUserByEmail(email);
    }

    @Override
    public User updateUser(User user) {
        return repository.updateUser(user);
    }

    @Override
    public void deleteUserByEmail(String email) {
        repository.deleteUserByEmail(email);
    }
}
