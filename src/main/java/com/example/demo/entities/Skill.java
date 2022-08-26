package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "skills")
public class Skill{

    @Id
    @GeneratedValue()
    private int id;

    @Column
    private String  name;

    @Column
    private String category;

    @Column
    private int rating;

    public Skill() {
    }

    public Skill(String name, String category, int rating){
        this.name = name;
        this.category = category;
        this.rating = rating;
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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

