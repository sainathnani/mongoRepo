package com.example.mongospring.service.users;

import com.example.mongospring.entity.Users;
import com.example.mongospring.requests.LoginDTO;
import com.example.mongospring.requests.SaveUserRequestDTO;
import org.springframework.http.ResponseEntity;

public interface UserService {

    String saveUser(SaveUserRequestDTO userRequestDTO);
//    String loginUser(LoginDTO userloginDTO);
    ResponseEntity<String> authenticateUser(LoginDTO loginDTO);
}
