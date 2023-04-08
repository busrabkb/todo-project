package com.todo.demo.service;

import com.todo.demo.Model.UserDTO;
import com.todo.demo.Model.UserRequest.UserRequestDTO;
import com.todo.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    public UserDTO postUser(UserRequestDTO requestDTO) {

        userRepository.findById(requestDTO.getId());
    }

    public UserDTO updateUser(UserRequestDTO requestDTO) {

    }

    public void deleteUser(UserRequestDTO requestDTO) {

    }

    public UserDTO getUser(String id) {
    }
}
