package com.example.social_network.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private String nickname;
    private String email;
    private String bio;
    private String createAt;
}
