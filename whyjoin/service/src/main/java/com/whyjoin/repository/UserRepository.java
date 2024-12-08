package com.whyjoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.whyjoin.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
