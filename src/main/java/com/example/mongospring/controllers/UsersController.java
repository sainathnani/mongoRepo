package com.example.mongospring.controllers;


import com.example.mongospring.requests.SaveUserRequestDTO;
import com.example.mongospring.service.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @Autowired
    UserService userService;

    @PostMapping("/saveUser")
    public ResponseEntity<Object> saveUser(@RequestBody SaveUserRequestDTO userRequestDTO) {

        String res = userService.saveUser(userRequestDTO);

        return new ResponseEntity<>(res, HttpStatus.OK);

    }
}
