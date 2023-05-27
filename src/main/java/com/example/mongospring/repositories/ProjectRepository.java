package com.example.mongospring.repositories;

import com.example.mongospring.entity.Projects;
import com.example.mongospring.entity.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepository extends MongoRepository<Projects, String> {


}
