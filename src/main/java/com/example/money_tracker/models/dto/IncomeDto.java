package com.example.money_tracker.models.dto;

import com.example.money_tracker.models.enums.Currency;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class IncomeDto {
    Long id;
    String designation;
    int sum;
    Currency currency;
    BillDto bill;
    Date addDate;
    Date updateDate;

}
