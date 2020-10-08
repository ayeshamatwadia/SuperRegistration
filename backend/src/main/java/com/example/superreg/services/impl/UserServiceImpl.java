package com.example.superreg.services.impl;

import com.example.superreg.entities.User;
import com.example.superreg.repository.UserRepository;
import com.example.superreg.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void saveUser(User user) {
        if(isValidUser(user)) userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public boolean isValidUser(User user){
        return true;
    }
}
