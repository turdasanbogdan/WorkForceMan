package com.example.demo.repositories;

import com.example.demo.entities.Project;
import com.example.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
    List<Project> findAll();
    Project findById(int id);
    Project findByName(String name);

    Project save(Project project);

    void delete(Project project);

    void deleteById(int id);

}
