package com.example.demo.services;

import com.example.demo.entities.Project;
import com.example.demo.entities.User;

import java.util.List;
import java.util.Set;

public interface ProjectService {

    List<Project> findAll();
    Project findById(int id);
    Project findByName(String name);

    Project createProject(Project project);

    Project updateProject(int id, Project project);

    void deleteProjectById(int id);

}
