package com.example.mongospring.controllers;

import com.example.mongospring.entity.Project;
import com.example.mongospring.requests.ProjectDetailsDTO;
import com.example.mongospring.service.users.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/projecdata")
    @CrossOrigin("http://localhost:3000/")
    public ResponseEntity<List<Project>> getProjectDetails() {

        List data = projectService.getProjectData();
        System.out.println("####################"+data);
        return  new ResponseEntity<>(data,HttpStatus.OK);
    //return ResponseEntity.ok().body(data);

    }

}
