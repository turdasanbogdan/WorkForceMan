package com.example.demo.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "projects")
public class Project implements Serializable {

    @Id
    @GeneratedValue()
    private int id;

    @Column
    String name;

    @Column
    String category;

    public Project() {
    }

    public Project(String name, String category){
        this.name = name;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}