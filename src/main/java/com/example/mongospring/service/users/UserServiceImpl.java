package com.example.mongospring.service.users;

import com.example.mongospring.entity.Users;
import com.example.mongospring.repositories.UsersRepository;
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

        Users user = new Users(userRequestDTO.getFirstName(), userRequestDTO.getLastName());
        log.info(user.toString());
        log.info(userRequestDTO.toString());

        usersRepository.save(user);

        return "Success";

    }
}
