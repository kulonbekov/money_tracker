package com.example.money_tracker.services.impl;

import com.example.money_tracker.dao.ExpenseRep;
import com.example.money_tracker.mappers.ExpenseMapper;
import com.example.money_tracker.models.dto.BillDto;
import com.example.money_tracker.models.dto.ExpenseDto;
import com.example.money_tracker.models.dto.UserDto;
import com.example.money_tracker.models.requests.ExpenseRequest;
import com.example.money_tracker.services.BillService;
import com.example.money_tracker.services.ExpenseService;
import com.example.money_tracker.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExpenseServiceImpl implements ExpenseService {
    ExpenseMapper mapper=ExpenseMapper.INSTANCE;

    private ExpenseRep rep;

    private BillService billService;
    private UserService userService;

    public ExpenseServiceImpl(ExpenseRep rep, BillService billService, UserService userService) {
        this.rep = rep;
        this.billService = billService;
        this.userService = userService;
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

    @Override
    public ExpenseDto create(ExpenseRequest expenseRequest) {
        ExpenseDto expenseDto=new ExpenseDto();
        expenseDto.setPurposeExpense(expenseRequest.getPurposeExpense());
        BillDto billDto=billService.findById(expenseRequest.getBillId());
        expenseDto.setBill(billDto);
        UserDto userDto= userService.findById(expenseRequest.getUserId());
        expenseDto.setUser(userDto);

        return save(expenseDto);
    }
}
