package com.example.mongospring.service.users;

import com.example.mongospring.entity.Project;
import com.example.mongospring.repositories.ProjectRepository;
import com.example.mongospring.requests.ProjectDetailsDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    private ProjectRepository projectsRepository;

    @Override
    public String createProject(ProjectDetailsDTO projectDetailsDTO) {
        Project project = new Project(projectDetailsDTO.getProjectName(),
                projectDetailsDTO.getProjectDescription(),projectDetailsDTO.getProjectVisibiltyDate());
        log.info(project.toString());
        log.info(projectDetailsDTO.toString());

        projectsRepository.save(project);

        return "ProjectSuccess";
    }

    @Override
    public List<Project> getProjectData() {
        List<Project> projectList = projectsRepository.findAll();
        return projectList;
    }



}
