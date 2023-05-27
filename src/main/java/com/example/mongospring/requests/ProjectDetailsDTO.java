package com.example.mongospring.requests;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class ProjectDetailsDTO {

    private String projectName;
    private String projectDescription;
    private Date projectVisibiltyDate;
}
