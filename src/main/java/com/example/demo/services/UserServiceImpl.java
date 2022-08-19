package com.example.demo.services;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository usersRepo;
    @Override
    public List<User> findAll() {
        return usersRepo.findAll();
    }

    @Override
    public User findById(int id) {
        return usersRepo.findById(id);
    }

    @Override
    public User findByUsername(String username) {
        return usersRepo.findByUsername(username);
    }
}
