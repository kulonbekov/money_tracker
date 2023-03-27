package com.example.money_tracker.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserDto {
    Long id;
    String name;
    String surname;
    String keyword;
    @JsonFormat(pattern = "dd.MM.yyyy HH:mm")
    Date addDate;

}
