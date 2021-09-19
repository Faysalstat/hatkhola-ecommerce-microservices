package com.myprojects.orderservice.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class AuthResponse {
    private String access_token;
    private String token_type;
}

