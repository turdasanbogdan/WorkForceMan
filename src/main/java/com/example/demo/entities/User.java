package com.example.demo.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue()
    private int id;

    @Column
    private String username;

    @Column
    private String first_name;

    @Column
    private String last_name;

    @Column
    private String role;

    @Column
    private String password;

    @Column
    private String status;

    public User() {
    }

    public User(String username, String first_name, String last_name, String role, String password, String status) {
        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
        this.role = role;
        this.password = password;
        this.status = status;
    }

    //getters and setters

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;


    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
