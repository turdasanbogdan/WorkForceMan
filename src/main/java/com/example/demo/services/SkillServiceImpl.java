package com.example.demo.services;

import com.example.demo.entities.Skill;
import com.example.demo.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SkillServiceImpl implements SkillService{
    @Autowired
    private SkillRepository skillRepo;

    @Override
    public List<Skill> findAll() {
        return skillRepo.findAll();
    }

    @Override
    public Skill findById(int id) {
        return skillRepo.findById(id);
    }

    @Override
    public Skill findByName(String name) {
        return skillRepo.findByName(name);
    }
}
