package com.genesis.spring.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.genesis.spring.graphql.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post,Integer> {
}

