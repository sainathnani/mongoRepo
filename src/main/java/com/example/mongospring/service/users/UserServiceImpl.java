package com.example.mongospring.service.users;

import com.example.mongospring.entity.Users;
import com.example.mongospring.repositories.UsersRepository;
import com.example.mongospring.requests.LoginDTO;
import com.example.mongospring.requests.SaveUserRequestDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public String saveUser(SaveUserRequestDTO userRequestDTO) {

        Users user = new Users(userRequestDTO.getFirstName(), userRequestDTO.getLastName(), userRequestDTO.getEmail(),
                userRequestDTO.getPassword(), userRequestDTO.getContact());
        log.info(user.toString());
        log.info(userRequestDTO.toString());

        Users emailUser = usersRepository.findByEmailId(userRequestDTO.getEmail());

        if (emailUser != null) {
            return "Email Already Exists";
        } else {
            usersRepository.save(user);
            return "Success";
        }

    }

//    @Override
//    public String loginUser(LoginDTO userloginDTO) {
//        Users user = new Users(userloginDTO.getEmail(), userloginDTO.getPassword());
//        log.info(user.toString());
//        log.info(userloginDTO.toString());
//
//        usersRepository.findById(userloginDTO.getEmail());
//
//        return "Login Successfully";
//    }

    @Override
    public ResponseEntity<String> authenticateUser(LoginDTO loginDTO) {
        log.info(loginDTO.toString());

        Users authenticatedUser = usersRepository.findByEmailIdAndPassword(loginDTO.getEmail(), loginDTO.getPassword());
        //log.info(authenticatedUser.toString());
        if (authenticatedUser != null) {
            // User is authenticated, proceed with login
            // Return success response
            return ResponseEntity.ok("Login Successfully");
        } else {
            // Invalid credentials
            // Return error response or unauthorized status
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Credentials");
        }
    }
}