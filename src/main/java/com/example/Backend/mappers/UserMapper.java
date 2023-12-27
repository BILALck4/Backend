package com.example.Backend.mappers;

import com.example.Backend.dtos.SignUpDto;
import com.example.Backend.dtos.UserDto;
import com.example.Backend.entites.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto signUpDto);

}
