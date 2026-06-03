package org.example.taskmanagementapi.repository;

import org.example.taskmanagementapi.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository
        extends JpaRepository<User, Integer> {

}
