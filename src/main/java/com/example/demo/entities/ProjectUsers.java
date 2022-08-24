package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "project_users")
public class ProjectUsers {

    @Id
    @GeneratedValue()
    private int id;

    @Column
    int project_id;

    @Column
    int user_id;

    public ProjectUsers(){}

    public ProjectUsers(int project_id, int user_id){
        this.project_id = project_id;
        this.user_id = user_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }
}
