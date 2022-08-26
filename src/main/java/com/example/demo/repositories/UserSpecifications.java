package com.example.demo.repositories;

import com.example.demo.entities.User;
import org.springframework.data.jpa.domain.Specification;

public class UserSpecifications {
    public static Specification<User> getUsersByUsername(String username){
        return (user, cq, cb) -> cb.equal(user.get("username"), username);
    }

    public static Specification<User> getUsersByFirstname(String first_name){
        return (user, cq, cb) -> cb.equal(user.get("first_name"), first_name);
    }

    public static Specification<User> getUsersByLastname(String last_name){
        return (user, cq, cb) -> cb.equal(user.get("last_name"), last_name);
    }

    public static Specification<User> getUsersByRole(String role){
        return (user, cq, cb) -> cb.equal(user.get("role"), role);
    }


}
