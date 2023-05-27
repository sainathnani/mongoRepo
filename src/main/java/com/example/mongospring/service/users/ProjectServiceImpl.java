package com.example.mongospring.service.users;

import com.example.mongospring.entity.Projects;
import com.example.mongospring.entity.Users;
import com.example.mongospring.repositories.ProjectRepository;
import com.example.mongospring.repositories.UsersRepository;
import com.example.mongospring.requests.LoginDTO;
import com.example.mongospring.requests.ProjectDetailsDTO;
import com.example.mongospring.requests.SaveUserRequestDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    private ProjectRepository projectsRepository;

    @Override
    public String createProject(ProjectDetailsDTO projectDetailsDTO) {
        Projects project = new Projects(projectDetailsDTO.getProjectName(),
                projectDetailsDTO.getProjectDescription(),projectDetailsDTO.getProjectVisibiltyDate());
        log.info(project.toString());
        log.info(projectDetailsDTO.toString());

        projectsRepository.save(project);

        return "ProjectSuccess";
    }




}
