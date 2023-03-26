package com.example.money_tracker.mappers;

import com.example.money_tracker.models.dto.IncomeDto;
import com.example.money_tracker.models.entities.Income;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IncomeMapper extends BaseMapper<Income, IncomeDto>{
    IncomeMapper INSTANCE= Mappers.getMapper(IncomeMapper.class);
}
