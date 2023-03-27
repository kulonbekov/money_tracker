package com.example.money_tracker.services.impl;

import com.example.money_tracker.dao.ExpenseRep;
import com.example.money_tracker.mappers.ExpenseMapper;
import com.example.money_tracker.models.dto.ExpenseDto;
import com.example.money_tracker.services.ExpenseService;

import java.util.List;

public class ExpenseServiceImpl implements ExpenseService {
    ExpenseMapper mapper=ExpenseMapper.INSTANCE;

    private ExpenseRep rep;

    public ExpenseServiceImpl(ExpenseRep rep) {
        this.rep = rep;
    }

    @Override
    public ExpenseDto save(ExpenseDto expenseDto) {
        return mapper.toDto(rep.save(mapper.toEntity(expenseDto)));
    }

    @Override
    public ExpenseDto findById(Long id) {

        return mapper.toDto(rep.findById(id).orElseThrow(()->new RuntimeException("Expense is not found")));
    }

    @Override
    public List<ExpenseDto> findAll() {

        return mapper.toDtos(rep.findAll());
    }

    @Override
    public ExpenseDto delete(Long id) {
        return null;
    }
}
