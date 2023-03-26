package com.example.money_tracker.models.dto;

import com.example.money_tracker.models.enums.Currency;
import com.example.money_tracker.models.enums.Type;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BillDto {
    Long id;
    String billName;
    boolean active;

}
