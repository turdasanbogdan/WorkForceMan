package com.example.demo.controllers;

import com.example.demo.entities.Skill;
import com.example.demo.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillRestController {
    @Autowired
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

//    @GetMapping("/username/{username}")
//    public Skill findByName(@PathVariable String name){
//        Skill skill  = skillService.findByName(name);
//
//        if(skill == null){
//            throw new RuntimeException("User not found" + name);
//        }
//
//        return skill;
//    }

    @GetMapping("/{name}")
    public List<Skill> getSkillsByName(@PathVariable String name){
        return skillService.getSkillsByName(name);
    }

//    @GetMapping("/{category}")
//    public List<Skill> getSkillsByCategory(@PathVariable String category){
//        return skillService.getSkillsByCategory(category);
//    }
//
//    @GetMapping("/{name}")
//    public List<Skill> getSkillsByRating(@PathVariable int rating){
//        return skillService.getSkillsByRating(rating);
//    }
    @PostMapping("/")
    Skill createSkill(@RequestBody Skill skill){return skillService.createSkill(skill);}

    @PutMapping("/{id}")
    Skill updateSkill(@PathVariable int id, @RequestBody Skill skill){
        return skillService.updateSkill(id, skill);
    }

    @DeleteMapping("/{id}")
    void deleteSkill(@PathVariable int id){
        skillService.deleteSkillById(id);
    }

}
