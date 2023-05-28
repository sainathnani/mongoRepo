package com.example.mongospring.repositories;

import com.example.mongospring.entity.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface UsersRepository extends MongoRepository<Users, String> {

    @Query("{'email': ?0}")
    Users findByEmailId(String email);

    @Query("{'email': ?0, 'password': ?1}")
    Users findByEmailIdAndPassword(String email, String password);
}
