package com.example.mongospring.service.users;

import com.example.mongospring.requests.LoginDTO;
import com.example.mongospring.requests.ProjectDetailsDTO;
import com.example.mongospring.requests.SaveUserRequestDTO;

public interface ProjectService {

    String createProject(ProjectDetailsDTO projectDetails);

}
