package com.example.demo.controllers;

import com.example.demo.entities.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserRestController {

    private UserService userService;

    @Autowired
    public UserRestController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/id/{id}")
    public User findById(@PathVariable int id){
        User user = userService.findById(id);

        if(user == null){
            throw new RuntimeException("User not found" + id);
        }

        return user;
    }

    @GetMapping("/username/{username}")
    public User findByUserName(@PathVariable String username){
        User user = userService.findByUserName(username);

        if(user == null){
            throw new RuntimeException("User not found" + username);
        }

        return user;
    }
}
