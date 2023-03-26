package com.example.money_tracker.models.dto;

import com.example.money_tracker.models.entities.Bill;
import com.example.money_tracker.models.entities.User;
import com.example.money_tracker.models.enums.Currency;
import com.example.money_tracker.models.enums.TypeOfIncome;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class IncomeDto {
    Long id;

    TypeOfIncome typeOfIncome;
    double sum;

    BillDto billDto;
    @JsonFormat(pattern = "dd.MM.yyyy HH:mm")
    Date addDate;

    UserDto userDto;

}
