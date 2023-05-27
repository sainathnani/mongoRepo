package com.example.mongospring.controllers;

import com.example.mongospring.requests.ProjectDetailsDTO;
import com.example.mongospring.requests.SaveUserRequestDTO;
import com.example.mongospring.service.users.ProjectService;
import com.example.mongospring.service.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @PostMapping("/createProject")
    @CrossOrigin("http://localhost:3000/")
    public ResponseEntity<Object> createProject(@RequestBody ProjectDetailsDTO projectDetails) {

        String res = projectService.createProject(projectDetails);

        return new ResponseEntity<>(res, HttpStatus.OK);

    }

}
