package com.todo.demo.controller;

import com.todo.demo.Model.UserDTO;
import com.todo.demo.Model.UserRequest.UserRequestDTO;
import com.todo.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@AllArgsConstructor
@RestController
public class UserController {
    private final UserService userService;

    @RequestMapping("/")
    public String index() {
        return null;
    }

    @PostMapping("/userPost")
    public UserDTO addUser(@RequestBody UserRequestDTO requestDTO) {
        userService.postUser();
        return null;
    }

    @GetMapping("/getUser/{id}")
    public Optional<UserDTO> getUser(@PathVariable String id) {

        userService.getUser(id);
        return null;

    }

    @DeleteMapping("/user/{id}")
    public void deleteById(@PathVariable String id) {
        userService.deleteUser();

    }

}