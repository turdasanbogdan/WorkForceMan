package com.example.demo.services;

import com.example.demo.entities.Skill;
import com.example.demo.entities.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User findById(int id);
    User findByUsername(String username);

    List<User> getUsersByUsername(String username);

    List<User> getUsersByFirstname(String first_name);

    List<User> getUsersByLastname(String last_name);

    List<User> getUsersByRole(String role);

    User createUser(User user);

    User updateUser(int id, User user);

    void deleteUserById(int id);
}
