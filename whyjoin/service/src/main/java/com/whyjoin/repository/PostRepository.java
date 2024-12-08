package com.whyjoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.whyjoin.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}