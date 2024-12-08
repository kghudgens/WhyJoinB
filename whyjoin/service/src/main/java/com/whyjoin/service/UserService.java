package com.whyjoin.service;

import java.util.List;

import com.whyjoin.entities.User;

public interface UserService {

    User saveUser(User user);

    List<User> fetchUserList();

    User updateUser(User user, Long userId);

    void deleteUserById(Long userId);
}
