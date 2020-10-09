package com.example.superreg.controllers;

import com.example.superreg.entities.User;
import com.example.superreg.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/user")
public class UserAPI {

    private UserService userService;

    @Autowired
    public UserAPI(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public void saveUser(@RequestBody User user) {
        System.out.println(">>>>>>> ATTEMPTING TO SAVE USER");
        userService.saveUser(user);
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        System.out.println(">>>>>>> ATTEMPTING TO GET ALL USERS");
        return userService.getUsers();
    }
}
