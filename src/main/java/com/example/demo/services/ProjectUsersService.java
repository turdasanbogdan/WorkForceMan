package com.example.demo.services;

import com.example.demo.entities.ProjectUsers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjectUsersService {

    List<ProjectUsers> findAll();

    ProjectUsers addUserToProject(ProjectUsers projectUsers);

    void deleteUserFromProject(int id);
}
