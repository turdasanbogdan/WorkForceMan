package com.example.demo.services;

import com.example.demo.entities.Project;
import com.example.demo.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProjectServiceImpl  implements ProjectService{
    @Autowired
    private ProjectRepository projectRepo;

    @Override
    public List<Project> findAll() {
        return projectRepo.findAll();
    }

    @Override
    public Project findById(int id) {
        return projectRepo.findById(id);
    }

    @Override
    public Project findByName(String name) {
        return projectRepo.findByName(name);
    }
}
