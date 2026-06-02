package org.example.taskmanagementapi.controller;
import org.example.taskmanagementapi.entity.user;
import org.example.taskmanagementapi.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService service;

    // POST API
    @PostMapping
    public ResponseEntity<user> addUser(
            @RequestBody user user) {

        return ResponseEntity.ok(
                service.addUser(user));
    }

    // GET ALL API
    @GetMapping
    public ResponseEntity<List<user>> getUsers() {

        return ResponseEntity.ok(
                service.getAllUsers());
    }

    // GET USER BY ID
    @GetMapping("/{id}")
    public ResponseEntity<user> getUserById(
            @PathVariable int id) {

        return ResponseEntity.ok(
                service.getUserById(id));
    }

    // UPDATE USER
    @PutMapping("/{id}")
    public ResponseEntity<user> updateUser(
            @PathVariable int id,
            @RequestBody user user) {

        return ResponseEntity.ok(
                service.updateUser(id, user));
    }

    // DELETE USER
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(
            @PathVariable int id) {

        return ResponseEntity.ok(
                service.deleteUser(id));
    }
}
