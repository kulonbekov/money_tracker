package com.example.money_tracker.services.impl;

import com.example.money_tracker.dao.IncomeRep;
import com.example.money_tracker.mappers.IncomeMapper;
import com.example.money_tracker.models.dto.IncomeDto;
import com.example.money_tracker.services.IncomeService;

import java.util.List;

public class IncomeServiceImpl implements IncomeService {
    IncomeMapper mapper=IncomeMapper.INSTANCE;

    private IncomeRep rep;

    public IncomeServiceImpl(IncomeRep rep) {
        this.rep = rep;
    }

    @Override
    public IncomeDto save(IncomeDto incomeDto) {
        return mapper.toDto(rep.save(mapper.toEntity(incomeDto)));
    }

    @Override
    public IncomeDto findById(Long id) {

        return mapper.toDto(rep.findById(id).orElseThrow(()->new RuntimeException("Income is not found")));
    }

    @Override
    public List<IncomeDto> findAll() {

        return mapper.toDtos(rep.findAll());
    }

    @Override
    public IncomeDto delete(Long id) {
        return null;
    }
}
