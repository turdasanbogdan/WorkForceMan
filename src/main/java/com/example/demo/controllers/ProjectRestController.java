package com.example.demo.controllers;

import com.example.demo.entities.*;
import com.example.demo.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/projects")
public class ProjectRestController {

    @Autowired
    private ProjectService projectService;

    @Autowired
    private ProjectSkillsService projectSkillsService;

    @Autowired
    private SkillService skillService;

    @Autowired
    private ProjectUsersService projectUsersService;

    @Autowired
    private UserService userService;

    @Autowired
    public ProjectRestController(ProjectService projectService, ProjectSkillsService projectSkillsService, SkillService skillService, ProjectUsersService projectUsersService, UserService userService){

        this.projectService = projectService;
        this.projectSkillsService = projectSkillsService;
        this.skillService = skillService;
        this.projectUsersService = projectUsersService;
        this.userService =userService;
    }

    @GetMapping("/")
    public List<Project> findAll(){

        return projectService.findAll();
    }

    @GetMapping("/id/{id}")
    public Project findById(@PathVariable int id){
        Project project = projectService.findById(id);

        if(project == null){
            throw new RuntimeException("Project not found" + id);
        }

        return project;
    }

    @GetMapping("/name/{name}")
    public Project findByName(@PathVariable String name){
        Project project = projectService.findByName(name);

        if(project == null){
            throw new RuntimeException("Project not found" + name);
        }

        return project;
    }

    @GetMapping("/skills/{id}")
    List<Skill> getAllSkills(@PathVariable int id){
        List<Skill> skills = projectSkillsService.findAll().stream().filter(ps -> ps.getProject_id() == id).map(ps -> skillService.findById(ps.getSkill_id())).toList();
        return skills;
    }

    @GetMapping("/users/{id}")
    List<User> getAllUsers(@PathVariable int id){
        List<User> users = projectUsersService.findAll().stream().filter(pu -> pu.getProject_id() == id).map(pu -> userService.findById(pu.getUser_id())).toList();
        return users;
    }


    @PostMapping("/")
    Project createProject(@RequestBody Project project){
        return projectService.createProject(project);
    }

    @PostMapping("/skills/{project_id}/{skill_id}")
    ProjectSkills addSkillToProject(@PathVariable int project_id, @PathVariable int skill_id){
        ProjectSkills newProjectSkill = new ProjectSkills(project_id, skill_id);
        return projectSkillsService.addSkillToProject(newProjectSkill);
    }

    @PostMapping("/users/{project_id}/{user_id}")
    ProjectUsers adduserToProject(@PathVariable int project_id, @PathVariable int user_id){
        ProjectUsers newProjectUser = new ProjectUsers(project_id, user_id);
        return projectUsersService.addUserToProject(newProjectUser);
    }
    @PutMapping("/{id}")
    Project updateProject(@PathVariable int id,@RequestBody Project project){
        return projectService.updateProject(id, project);
    }

    @DeleteMapping("/{id}")
    void deleteProject(@PathVariable int id){
        projectService.deleteProjectById(id);
    }


}
