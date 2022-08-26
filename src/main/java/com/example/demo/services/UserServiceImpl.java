package com.example.demo.services;

import com.example.demo.entities.Skill;
import com.example.demo.entities.User;
import com.example.demo.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository usersRepo;

    @Autowired
    private SkillRepository skillRepo;

    @Autowired
    private UserSkillsRepository userSkillsRepo;
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
    public List<User> getUsersByUsername(String username) {
      return usersRepo.findAll(UserSpecifications.getUsersByUsername(username));
    }

    @Override
    public List<User> getUsersByFirstname(String first_name) {
        return usersRepo.findAll(UserSpecifications.getUsersByFirstname(first_name));
    }

    @Override
    public List<User> getUsersByLastname(String last_name) {
        return usersRepo.findAll(UserSpecifications.getUsersByLastname(last_name));
    }

    @Override
    public List<User> getUsersByRole(String role) {
        return usersRepo.findAll(UserSpecifications.getUsersByRole(role));
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
