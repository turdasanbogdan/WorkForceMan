package com.example.demo.services;

import com.example.demo.entities.UserSkills;
import com.example.demo.repositories.UserSkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSkillsServiceImpl implements UserSkillsService{
    @Autowired
    UserSkillsRepository userSkillsRepo;

    @Override
    public List<UserSkills> findAll() {
        return userSkillsRepo.findAll();
    }

    @Override
    public UserSkills addSkillToUser(UserSkills userSkills) {
        return userSkillsRepo.save(userSkills);
    }

    @Override
    public void deleteSkillFromUser(int id) {
        userSkillsRepo.deleteById(id);
    }
}
