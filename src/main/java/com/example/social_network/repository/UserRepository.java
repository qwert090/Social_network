package com.example.social_network.repository;

import com.example.social_network.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class UserRepository {

    private final List<User> users = new ArrayList<>();

    public List<User> findAll() {
        users.add(User.builder().nickname("steve").email("petracho").bio("cool").createAt("12.12.12").build());
        return users;
    }

    public User createUser(User user) {
        users.add(user);
        return user;
    }

    public User findUserByEmail(String email) {
        return users.stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }

    public User updateUser(User user) {
        var userIndex = IntStream.range(0, users.size())
                .filter(index -> users.get(index).getEmail().equals(user.getEmail()))
                .findFirst()
                .orElse(-1);
        if(userIndex > -1){
            users.set(userIndex, user);
            return user;
        }
        return null;
    }

    public void deleteUserByEmail(String email) {
        var user = findUserByEmail(email);
        if (user != null){
            users.remove(user);
        }
    }
}
