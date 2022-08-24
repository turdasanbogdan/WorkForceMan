package com.example.demo.services;

import com.example.demo.entities.ProjectSkills;
import com.example.demo.repositories.ProjectSkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectSkillsServiceImpl implements ProjectSkillsService{

    @Autowired
    private ProjectSkillsRepository projectSkillsRepo;

    @Override
    public List<ProjectSkills> findAll() {
        return projectSkillsRepo.findAll();
    }

    @Override
    public ProjectSkills addSkillToProject(ProjectSkills projectSkills) {
        return projectSkillsRepo.save(projectSkills);
    }

    @Override
    public void deleteSkillFromProject(int id) {
        projectSkillsRepo.deleteById(id);
    }
}
