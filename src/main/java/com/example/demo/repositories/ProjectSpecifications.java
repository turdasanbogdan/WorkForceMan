package com.example.demo.repositories;

import com.example.demo.entities.Project;
import org.springframework.data.jpa.domain.Specification;

public class ProjectSpecifications {

    public static Specification<Project> getProjectsByName(String name){
        return (skill, cq, cb) -> cb.equal(skill.get("name"), name);
    }

    public static Specification<Project> getProjectsByCategory(String category){
        return (skill, cq, cb) -> cb.equal(skill.get("category"), category);
    }

}
