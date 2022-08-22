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

    @Override
    public User createUser(User user) {
        return usersRepo.save(user);
    }

    @Override
    public User updateUser(int id, User user) {
        User userToUpdate = usersRepo.findById(id);
        userToUpdate.setLast_name(user.getLast_name());
        userToUpdate.setFirst_name(user.getFirst_name());
        userToUpdate.setPassword(user.getPassword());
        userToUpdate.setRole(user.getRole());
        userToUpdate.setUsername(user.getUsername());

        return userToUpdate;
    }

    @Override
    public void deleteUserById(int id) {
        usersRepo.deleteById(id);
    }
}
