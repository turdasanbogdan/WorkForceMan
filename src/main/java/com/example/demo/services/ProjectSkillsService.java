package com.example.demo.services;

import com.example.demo.entities.ProjectSkills;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjectSkillsService {

    List<ProjectSkills> findAll();

    ProjectSkills addSkillToProject(ProjectSkills projectSkills);

    void deleteSkillFromProject(int id);
}
