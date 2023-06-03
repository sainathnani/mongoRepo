package com.example.mongospring.service.users;

import com.example.mongospring.entity.Project;
import com.example.mongospring.requests.ProjectDetailsDTO;

import java.util.List;

public interface ProjectService {

    String createProject(ProjectDetailsDTO projectDetails);
    List<Project> getProjectData();

}
