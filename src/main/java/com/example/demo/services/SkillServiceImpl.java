package com.example.demo.services;

import com.example.demo.entities.Skill;
import com.example.demo.repositories.SkillRepository;
import com.example.demo.repositories.SkillSpecifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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

    @Override
    public Skill createSkill(Skill skill) {
        return skillRepo.save(skill);
    }

    @Override
    public Skill updateSkill(int id, Skill skill) {
        Skill skillToUpdate = skillRepo.findById(id);
        skillToUpdate.setName(skill.getName());
        skillToUpdate.setCategory(skill.getCategory());

        return skillRepo.save(skillToUpdate);
    }

    @Override
    public List<Skill> getSkillsByName(String name) {
        return skillRepo.findAll(SkillSpecifications.getSkillsByName(name));
    }

    @Override
    public List<Skill> getSkillsByCategory(String category) {

        return skillRepo.findAll(SkillSpecifications.getSkillsByCategory(category));

    }

    @Override
    public List<Skill> getSkillsByRating(int rating) {
        return skillRepo.findAll(SkillSpecifications.getSkillsByRating(rating));
    }

    @Override
    public void deleteSkillById(int id) {
        skillRepo.deleteById(id);
    }
}
