package com.support.UserInfo.service;

import com.support.UserInfo.dto.UserDto;
import com.support.UserInfo.entity.User;
import com.support.UserInfo.mapper.UserMapper;
import com.support.UserInfo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    public UserRepo userRepo;

    public UserDto addUser(UserDto userdto) {

        User user= userRepo.save(UserMapper.Instance.mapUserDtoToUser(userdto));
        return UserMapper.Instance.mapUserToUserDto(user);

    }
    public ResponseEntity<UserDto> fecthuserById(Integer id) {

        Optional<User> user=userRepo.findById(id);
        if(user.isPresent())
            return new ResponseEntity<>(UserMapper.Instance.mapUserToUserDto(user.get()), HttpStatus.OK);

        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
}
