package com.example.social_network.model;

import lombok.*;

@Data
@Builder
public class User {
    private String nickname;
    private String email;
    private String bio;
    private String createAt;

}
