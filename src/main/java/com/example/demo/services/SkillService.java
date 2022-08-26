package com.example.demo.services;

import com.example.demo.entities.Skill;

import java.util.List;

public interface SkillService {
    List<Skill> findAll();
    Skill findById(int id);
    Skill findByName(String name);

    Skill createSkill(Skill skill);

    Skill updateSkill(int id, Skill project);

    List<Skill> getSkillsByName(String name);

    List<Skill> getSkillsByCategory(String category);

    List<Skill> getSkillsByRating(int rating);

    void deleteSkillById(int id);
}
