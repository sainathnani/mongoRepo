package com.example.mongospring.service.users;

import com.example.mongospring.entity.Users;
import com.example.mongospring.repositories.UsersRepository;
import com.example.mongospring.requests.LoginDTO;
import com.example.mongospring.requests.SaveUserRequestDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UsersRepository usersRepository;
    @Override
    public String saveUser(SaveUserRequestDTO userRequestDTO) {

        Users user = new Users(userRequestDTO.getFirstName(), userRequestDTO.getLastName(),userRequestDTO.getEmail(),
                userRequestDTO.getPassword(),userRequestDTO.getContact());
        log.info(user.toString());
        log.info(userRequestDTO.toString());

        usersRepository.save(user);

        return "Success";

    }

    @Override
    public String loginUser(LoginDTO userloginDTO) {
        Users user = new Users(userloginDTO.getEmail(), userloginDTO.getPassword());
        log.info(user.toString());
        log.info(userloginDTO.toString());

        usersRepository.findById(userloginDTO.getEmail());

        return "Login Successfully";
    }
}
