package com.genesis.spring.graphql.repository;

import com.genesis.spring.graphql.model.User;
import com.google.common.base.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Transactional
    @Modifying
    @Query(value = "UPDATE user SET address = ?1 WHERE user_id = ?2 ", nativeQuery = true)
    int updateUserAddress(String address, Integer user_id);
}
