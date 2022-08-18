package com.example.demo.services;

import com.example.demo.entities.Skill;

import java.util.List;

public interface SkillService {
    List<Skill> findAll();
    Skill findById(int id);
    Skill findByName(String name);
}
