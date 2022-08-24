package com.example.demo.repositories;

import com.example.demo.entities.UserSkills;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSkillsRepository extends JpaRepository<UserSkills, Integer> {
}
