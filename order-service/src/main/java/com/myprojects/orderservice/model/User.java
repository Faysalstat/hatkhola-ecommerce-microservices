package com.myprojects.orderservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
public class User {
    private String grant_type;
    private String username;
    private String password;
}
