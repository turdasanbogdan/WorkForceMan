package com.example.demo.services;

import com.example.demo.entities.Project;
import com.example.demo.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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

    @Override
    public Project createProject(Project project) {
        return projectRepo.save(project);
    }

    @Override
    public Project updateProject(int id, Project project) {
        Project projectToUpdate = projectRepo.findById(id);
        projectToUpdate.setName(project.getName());
        projectToUpdate.setCategory(project.getCategory());

        return projectRepo.save(projectToUpdate);
    }

    @Override
    public void deleteProjectById(int id) {
        projectRepo.deleteById(id);
    }


}
