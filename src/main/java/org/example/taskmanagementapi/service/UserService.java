package org.example.taskmanagementapi.service;
import org.example.taskmanagementapi.entity.user;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<user> users =
            new ArrayList<>();

    // Add User
    public user addUser(user user) {

        users.add(user);

        return user;
    }

    // Get All Users
    public List<user> getAllUsers() {

        return users;
    }

    // Get User By ID
    public user getUserById(int id) {

        for (user user : users) {

            if (user.getId() == id) {

                return user;
            }
        }

        return null;
    }

    // Update User
    public user updateUser(
            int id,
            user updatedUser) {

        for (user user : users) {

            if (user.getId() == id) {

                user.setName(
                        updatedUser.getName());

                user.setEmail(
                        updatedUser.getEmail());

                return user;
            }
        }

        return null;
    }

    // Delete User
    public String deleteUser(int id) {

        users.removeIf(user ->
                user.getId() == id);

        return "User Deleted";
    }
}
