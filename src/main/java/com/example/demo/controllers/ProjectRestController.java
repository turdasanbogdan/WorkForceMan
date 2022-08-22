package com.example.demo.controllers;

import com.example.demo.entities.Project;
import com.example.demo.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectRestController {

    @Autowired
    private ProjectService projectService;

    @Autowired
    public ProjectRestController(ProjectService projectService){
        this.projectService = projectService;
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

    @PostMapping("/")
    Project createProject(@RequestBody Project project){
        return projectService.createProject(project);
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
