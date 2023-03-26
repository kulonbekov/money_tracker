package com.example.money_tracker.models.dto;

import com.example.money_tracker.models.enums.Role;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountDto {

    Long id;
    String email;
    String password;
    UserDto userDto;
    List<Role> roles;
}
