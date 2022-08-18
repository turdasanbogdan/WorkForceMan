package com.example.demo.services;

import com.example.demo.entities.Project;

import java.util.List;

public interface ProjectService {

    List<Project> findAll();
    Project findById(int id);
    Project findByName(String name);

}
