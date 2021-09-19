package com.myprojects.userservice.controller;

import com.myprojects.userservice.controller.model.User;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    public User getUser(){
        User user = new User();
        user.setUserName("admin");
        user.setPassword("admin");
        return user;
    }
}
