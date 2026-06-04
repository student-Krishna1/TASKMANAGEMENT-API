package org.example.taskmanagementapi.controller;
import org.example.taskmanagementapi.entity.User;
import org.example.taskmanagementapi.repository.UserRepository;
import org.example.taskmanagementapi.service.UserService;

import jakarta.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/users")
    public User addUser(
            @Valid
            @RequestBody User user) {

        return service.saveUser(user);
    }

    @GetMapping("/users")
    public List<User> getUsers() {

        return service.getAllUsers();
    }
}