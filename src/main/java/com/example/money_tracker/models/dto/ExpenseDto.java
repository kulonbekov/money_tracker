package com.example.money_tracker.models.dto;

import com.example.money_tracker.models.enums.Currency;
import com.example.money_tracker.models.enums.PurposeExpense;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ExpenseDto {
    Long id;
    PurposeExpense purposeExpense;
    int sum;
    Currency currency;
    BillDto billName;
    Date addDate;
    Date updateDate;

}
