package com.solruf.services.controller;

import com.solruf.services.model.User;
import com.solruf.services.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/user")
    public List<User> getAll() {
        return repository.findAll();
    }

    @PostMapping("/user")
    public User create(@RequestBody final User user) {
        return repository.save(user);
    }
}
