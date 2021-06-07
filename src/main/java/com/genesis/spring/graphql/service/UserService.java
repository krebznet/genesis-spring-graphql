package com.genesis.spring.graphql.service;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.genesis.spring.graphql.model.User;
import com.genesis.spring.graphql.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User updateUserAddress(Integer userId, String address) throws Exception {
        try {
            userRepository.updateUserAddress(address, userId);
            User user = userRepository.findById(userId).get();
            return user;
        } catch (Exception e) {
            throw new Exception(e);
        }

    }
    

    public User createUser(User user) throws Exception {
        try {
            userRepository.save(user);
            User users = userRepository.findById(user.getUserId()).get();
            return users;
        } catch (Exception e) {
            throw new Exception(e);
        }

    }

}
