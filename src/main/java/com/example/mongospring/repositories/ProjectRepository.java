package com.example.mongospring.repositories;

import com.example.mongospring.entity.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepository extends MongoRepository<Project, String> {


}
