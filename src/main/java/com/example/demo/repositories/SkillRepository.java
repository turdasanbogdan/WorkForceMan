package com.example.demo.repositories;

import com.example.demo.entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SkillRepository extends JpaRepository<Skill, Integer> {
    List<Skill> findAll();
    Skill findById(int id);
    Skill findByName(String name);

    Skill save(Skill skill);

    void delete(Skill skill);

    void deleteById(int id);
}
