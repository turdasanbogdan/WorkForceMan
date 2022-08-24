package com.example.demo.services;

import com.example.demo.entities.ProjectUsers;
import com.example.demo.repositories.ProjectUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectUsersServiceImpl implements ProjectUsersService{

    @Autowired
    private ProjectUsersRepository projectUsersRepository;
    @Override
    public List<ProjectUsers> findAll() {
        return projectUsersRepository.findAll();
    }

    @Override
    public ProjectUsers addUserToProject(ProjectUsers projectUsers) {
        return projectUsersRepository.save(projectUsers);
    }

    @Override
    public void deleteUserFromProject(int id) {
        projectUsersRepository.deleteById(id);
    }
}
