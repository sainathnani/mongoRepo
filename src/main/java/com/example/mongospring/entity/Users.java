package com.example.mongospring.entity;


import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("users")
@ToString
public class Users {

    private String firstName;
    private String lastName;

    public Users(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
