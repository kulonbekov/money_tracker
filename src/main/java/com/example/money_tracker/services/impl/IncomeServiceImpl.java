package com.example.money_tracker.services.impl;

import com.example.money_tracker.dao.IncomeRep;
import com.example.money_tracker.mappers.IncomeMapper;
import com.example.money_tracker.models.dto.BillDto;
import com.example.money_tracker.models.dto.IncomeDto;
import com.example.money_tracker.models.dto.UserDto;
import com.example.money_tracker.models.requests.IncomeRequest;
import com.example.money_tracker.services.BillService;
import com.example.money_tracker.services.IncomeService;
import com.example.money_tracker.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IncomeServiceImpl implements IncomeService {
    IncomeMapper mapper=IncomeMapper.INSTANCE;

    private IncomeRep rep;
    private UserService userService;
    private BillService billService;

    public IncomeServiceImpl(IncomeRep rep, UserService userService, BillService billService) {
        this.rep = rep;
        this.userService = userService;
        this.billService = billService;
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

    @Override
    public IncomeDto create(IncomeRequest incomeRequest) {

        IncomeDto incomeDto=new IncomeDto();
        incomeDto.setTypeOfIncome(incomeRequest.getTypeOfIncome());
        incomeDto.setSum(incomeRequest.getSum());
        BillDto billDto= billService.findById(incomeRequest.getBillId());
        incomeDto.setBill(billDto);
        UserDto userDto= userService.findById(incomeRequest.getUserId());
        incomeDto.setUser(userDto);

        return save(incomeDto);
    }
}
