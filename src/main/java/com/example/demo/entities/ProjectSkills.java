package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "project_skills")
public class ProjectSkills {

    @Id
    @GeneratedValue()
    int id;

    @Column
    int project_id;

    @Column
    int skill_id;

    public ProjectSkills(){}

    public ProjectSkills(int project_id, int skill_id){
        this.project_id = project_id;
        this.skill_id = skill_id;
    }

    public int getId() {
        return id;
    }

    public int getProject_id() {
        return project_id;
    }

    public int getSkill_id() {
        return skill_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public void setSkill_id(int skill_id) {
        this.skill_id = skill_id;
    }
}
