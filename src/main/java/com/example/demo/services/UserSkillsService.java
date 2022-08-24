package com.example.demo.services;


import com.example.demo.entities.ProjectSkills;
import com.example.demo.entities.UserSkills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserSkillsService {

    List<UserSkills> findAll();

    UserSkills addSkillToUser(UserSkills userSkills);

    void deleteSkillFromUser(int id);
}
