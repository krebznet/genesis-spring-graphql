package com.genesis.spring.graphql.service;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.genesis.spring.graphql.model.Post;
import com.genesis.spring.graphql.model.User;
import com.genesis.spring.graphql.repository.PostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService implements GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    private PostRepository postRepository;
    
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }
    
    public Post createPost(Post post) throws Exception {
        try {
        	postRepository.save(post);
            Post posts = postRepository.findById(post.getPostId()).get();
            return posts;
        } catch (Exception e) {
            throw new Exception(e);
        }

    }

}
