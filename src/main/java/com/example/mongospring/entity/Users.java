package com.example.mongospring.entity;


import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("users")
@ToString
public class Users {

    private String firstName;
    private String lastName;
    private String contact;
    private String email;
    private String password;

    public Users(String firstName, String lastName,String email,String password,String contact) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.contact = contact;
    }
}
