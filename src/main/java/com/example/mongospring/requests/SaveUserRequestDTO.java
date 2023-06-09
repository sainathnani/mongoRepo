package com.example.mongospring.requests;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class SaveUserRequestDTO {

    private String firstName;
    private String lastName;
    private String contact;
    private String email;
    private String password;
}
