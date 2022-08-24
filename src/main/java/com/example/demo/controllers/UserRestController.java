package com.example.demo.controllers;

import com.example.demo.entities.*;
import com.example.demo.services.ProjectService;
import com.example.demo.services.SkillService;
import com.example.demo.services.UserService;
import com.example.demo.services.UserSkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserRestController {

    @Autowired
    private UserService userService;

    @Autowired
    private SkillService skillService;

    @Autowired
    private UserSkillsService userSkillsService;


    @Autowired
    public UserRestController(UserService userService, SkillService skillService, UserSkillsService userSkillsService){
        this.userService = userService;
        this.skillService = skillService;
        this.userSkillsService = userSkillsService;
    }

    @GetMapping("/")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/id/{id}")
    public User findById(@PathVariable int id){
        User user = userService.findById(id);

        if(user == null){
            throw new RuntimeException("User not found" + id);
        }

        return user;
    }

    @GetMapping("/username/{username}")
    public User findByUsername(@PathVariable String username){
        User user = userService.findByUsername(username);

        if(user == null){
            throw new RuntimeException("User not found" + username);
        }

        return user;
    }

    @GetMapping("/skills/{id}")
    List<Skill> getAllSkills(@PathVariable int id){
        List<Skill> skills = userSkillsService.findAll().stream().filter(us -> us.getUser_id() == id).map(us -> skillService.findById(us.getSkill_id())).toList();
        return skills;
    }

    @PostMapping("/")
    public User createUser(@RequestBody @Valid User user){
        return userService.createUser(user);}

    @PostMapping("/skills/{user_id}/{skill_id}")
    UserSkills addSkillToUser(@PathVariable int user_id, @PathVariable int skill_id){
        UserSkills newUserSkills = new UserSkills(user_id, skill_id);
        return userSkillsService.addSkillToUser(newUserSkills);
    }

    @PutMapping("/{id}")
    User updateUser(@PathVariable int id, @RequestBody User user){ return userService.updateUser(id, user);}

    @DeleteMapping("/{id}")
    void deleteUser(@PathVariable int id){ userService.deleteUserById(id);}
}
