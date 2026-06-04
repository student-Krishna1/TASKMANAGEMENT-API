package org.example.taskmanagementapi.controller;

import org.example.taskmanagementapi.entity.User;
import org.example.taskmanagementapi.service.UserService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    // CREATE USER
    @PostMapping("/users")
    public User addUser(

            @Valid
            @RequestBody User user) {

        return service.saveUser(user);
    }

    // GET ALL USERS
    @GetMapping("/users")
    public List<User> getUsers() {

        return service.getAllUsers();
    }

    // GET USER BY ID
    @GetMapping("/users/{id}")
    public User getUserById(

            @PathVariable int id) {

        return service.getUserById(id);
    }

    // UPDATE USER
    @PutMapping("/users/{id}")
    public User updateUser(

            @PathVariable int id,

            @RequestBody User user) {

        return service.updateUser(id, user);
    }

    // DELETE USER
    @DeleteMapping("/users/{id}")
    public String deleteUser(

            @PathVariable int id) {

        return service.deleteUser(id);
    }
}