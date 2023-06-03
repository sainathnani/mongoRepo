package com.example.mongospring.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "projects")
@ToString
public class Project {

    @JsonProperty
    private String projectName;
    @JsonProperty
    private String projectDescription;
    @JsonProperty
    private Date projectVisibiltyDate;


    public Project(String projectName, String projectDescription, Date projectVisibiltyDate) {

        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.projectVisibiltyDate = projectVisibiltyDate;

    }


}
