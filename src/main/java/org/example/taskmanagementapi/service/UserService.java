package org.example.taskmanagementapi.service;
import org.example.taskmanagementapi.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> users =
            new ArrayList<>();

    // Add User
    public User addUser(User user) {

        users.add(user);

        return user;
    }

    // Get All Users
    public List<User> getAllUsers() {

        return users;
    }

    // Get User By ID
    public User getUserById(int id) {

        for (User user : users) {

            if (user.getId() == id) {

                return user;
            }
        }

        return null;
    }

    // Update User
    public User updateUser(
            int id,
            User updatedUser) {

        for (User user : users) {

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
