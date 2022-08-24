package com.example.demo.repositories;

import com.example.demo.entities.ProjectUsers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectUsersRepository extends JpaRepository<ProjectUsers, Integer> {
}
