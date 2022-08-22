package com.example.demo.controllers;

import com.example.demo.entities.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserRestController {

    @Autowired
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
    public User findByUsername(@PathVariable String username){
        User user = userService.findByUsername(username);

        if(user == null){
            throw new RuntimeException("User not found" + username);
        }

        return user;
    }

    @PostMapping("/")
    User createUser(@RequestBody User user){ return userService.createUser(user);}

    @PutMapping("/{id}")
    User updateUser(@PathVariable int id, @RequestBody User user){ return userService.updateUser(id, user);}

    @DeleteMapping("/{id}")
    void deleteUser(@PathVariable int id){ userService.deleteUserById(id);}
}
