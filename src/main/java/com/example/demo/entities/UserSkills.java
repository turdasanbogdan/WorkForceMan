package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name ="user_skills")
public class UserSkills {

    @Id
    @GeneratedValue()
    private int id;

    @Column
    int user_id;

    @Column
    int skill_id;

    public UserSkills(){}

    public UserSkills(int user_id, int skill_id){
        this.user_id = user_id;
        this.skill_id = skill_id;
    }
    public int getUser_id() {
        return user_id;
    }

    public int getSkill_id() {
        return skill_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setSkill_id(int skill_id) {
        this.skill_id = skill_id;
    }
}
