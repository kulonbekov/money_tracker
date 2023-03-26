package com.example.money_tracker.mappers;

import com.example.money_tracker.models.dto.BillDto;
import com.example.money_tracker.models.entities.Bill;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BillMapper extends BaseMapper<Bill, BillDto> {
    BillMapper INSTANCE = Mappers.getMapper(BillMapper.class);
}
