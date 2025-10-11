package com.support.UserInfo.controller;

import com.support.UserInfo.dto.UserDto;
import com.support.UserInfo.service.UserService;
import jakarta.ws.rs.POST;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    public UserService userService;
     @PostMapping("/adduser")
    public ResponseEntity<UserDto> addUser(@RequestBody UserDto user)

    {
        UserDto userDto=userService.addUser(user);
        return new ResponseEntity<>(userDto,HttpStatus.CREATED);
    }

    @GetMapping("/fetchById/{id}")
    public ResponseEntity<UserDto> fetchById(@PathVariable Integer id) {
        return userService.fecthuserById(id);

    }
}
