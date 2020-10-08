package com.example.superreg.controller;

import com.example.superreg.entities.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserAPI {
    @PostMapping("/save")
    public void saveUser(@RequestBody User user) {
        System.out.println(user.toString());
    }
}
