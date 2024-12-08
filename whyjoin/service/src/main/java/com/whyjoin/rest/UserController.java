package com.whyjoin.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.whyjoin.branch.Branch;
import com.whyjoin.entities.User;
import com.whyjoin.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/registerUser")
    public User registerNewUser(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName,
            @PathVariable("branch") Branch branch, @PathVariable("age") int age) {
        User newUser = new User(firstName, lastName, branch, age);
        return userService.saveUser(newUser);
    }

    // finish out the methods

}
