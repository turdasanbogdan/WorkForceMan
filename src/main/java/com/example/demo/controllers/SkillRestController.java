package com.example.demo.controllers;

import com.example.demo.entities.Skill;
import com.example.demo.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillRestController {
    private SkillService skillService;

    @Autowired
    public SkillRestController(SkillService skillService){
        this.skillService = skillService;
    }

    @GetMapping("/")
    public List<Skill> findAll(){
        return skillService.findAll();
    }

    @GetMapping("/id/{id}")
    public Skill findById(@PathVariable int id){
        Skill skill = skillService.findById(id);

        if(skill == null){
            throw new RuntimeException("Skill not found" + id);
        }

        return skill;
    }

    @GetMapping("/username/{username}")
    public Skill findByName(@PathVariable String name){
        Skill skill  = skillService.findByName(name);

        if(skill == null){
            throw new RuntimeException("User not found" + name);
        }

        return skill;
    }

}
