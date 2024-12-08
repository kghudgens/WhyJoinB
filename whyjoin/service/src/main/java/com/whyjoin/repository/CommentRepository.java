package com.whyjoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.whyjoin.entities.Comments;

public interface CommentRepository extends JpaRepository<Comments, Long> {

}
