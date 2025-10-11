package com.support.UserInfo.mapper;
import com.support.UserInfo.dto.UserDto;
import com.support.UserInfo.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper Instance= Mappers.getMapper(UserMapper.class);
    public User mapUserDtoToUser(UserDto userDto);
    public UserDto mapUserToUserDto(User userDto);
}
