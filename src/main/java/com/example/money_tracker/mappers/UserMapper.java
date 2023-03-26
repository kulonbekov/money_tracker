package com.example.money_tracker.mappers;

import com.example.money_tracker.models.dto.UserDto;
import com.example.money_tracker.models.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper extends BaseMapper<User, UserDto> {
    UserMapper INSTANCE= Mappers.getMapper(UserMapper.class);
}
