package com.example.demo.repositories;

import com.example.demo.entities.Skill;
import com.example.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

import javax.transaction.Transactional;

public interface UserRepository  extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {
    List<User> findAll();
    User findById(int id);
   User findByUsername(String username);

    User save(User user);

    void delete(User user);

    void deleteById(int id);
}
