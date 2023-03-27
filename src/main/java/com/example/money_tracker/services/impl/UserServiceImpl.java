package com.example.money_tracker.services.impl;

import com.example.money_tracker.dao.UserRep;
import com.example.money_tracker.mappers.UserMapper;
import com.example.money_tracker.models.dto.UserDto;
import com.example.money_tracker.services.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserMapper mapper=UserMapper.INSTANCE;

    private UserRep rep;

    public UserServiceImpl(UserRep rep) {
        this.rep = rep;
    }

    @Override
    public UserDto save(UserDto userDto) {
        return mapper.toDto(rep.save(mapper.toEntity(userDto)));
    }

    @Override
    public UserDto findById(Long id) {

        return mapper.toDto(rep.findById(id).orElseThrow(()->new RuntimeException("User is not found")));
    }

    @Override
    public List<UserDto> findAll() {

        return mapper.toDtos(rep.findAll());
    }

    @Override
    public UserDto delete(Long id) {
        return null;
    }
}
