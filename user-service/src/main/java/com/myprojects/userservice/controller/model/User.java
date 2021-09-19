package com.myprojects.userservice.controller.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class User {
    Long id;
    String userName;
    String email;
    String password;
}
