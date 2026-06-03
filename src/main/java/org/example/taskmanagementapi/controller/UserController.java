package org.example.taskmanagementapi.controller;
import org.example.taskmanagementapi.entity.User;
import org.example.taskmanagementapi.repository.UserRepository;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping("/users")
    public User addUser(
            @Valid
            @RequestBody User user) {

        return repository.save(user);
    }

    @GetMapping("/users")
    public List<User> getUsers() {

        return repository.findAll();
    }
}