package com.example.social_network.service.ServiceInterface;

import com.example.social_network.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
     List<User> findAll();
     User createUser(User user);
     User findUserByNickname(String nickname);
     User updateUser(User user);
     void deleteUserByEmail(String email);
}
