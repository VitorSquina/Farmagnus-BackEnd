package com.farmagnus.farmagnus.controller;

import com.farmagnus.farmagnus.Medicamento.Medicamento;
import com.farmagnus.farmagnus.user.User;
import com.farmagnus.farmagnus.user.UserDto;
import com.farmagnus.farmagnus.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UsersRepository repository;

    @PostMapping
    public void saveUser(@RequestBody Medicamento.UserRequestDto data){
        User userData = new User(data);
        repository.save(userData);
        return;
    }

    @GetMapping
    public List<UserDto> getAll() {
        List<UserDto> userList = repository.findAll().stream().map(UserDto::new).toList();
        return userList;
    }
}