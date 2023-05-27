package com.example.mongospring.entity;


import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("projects")
@ToString
public class Projects {

    private String projectName;
    private String projectDescription;
    private Date projectVisibiltyDate;


    public Projects(String projectName, String projectDescription, Date projectVisibiltyDate) {

        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.projectVisibiltyDate = projectVisibiltyDate;

    }


}
