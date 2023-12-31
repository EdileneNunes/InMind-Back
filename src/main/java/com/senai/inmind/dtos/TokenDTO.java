package com.senai.inmind.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor @Data
public class TokenDTO {
    private String token;
    private String refreshToken;
    private String email;
}

