package com.example.money_tracker.mappers;

import com.example.money_tracker.models.dto.ExpenseDto;
import com.example.money_tracker.models.entities.Expense;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ExpenseMapper extends BaseMapper<Expense, ExpenseDto>{
    ExpenseMapper INSTANCE = Mappers.getMapper(ExpenseMapper.class);
}
