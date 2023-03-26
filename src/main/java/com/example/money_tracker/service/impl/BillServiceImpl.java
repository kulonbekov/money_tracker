package com.example.money_tracker.service.impl;

import com.example.money_tracker.dao.BillRep;
import com.example.money_tracker.mappers.BillMapper;
import com.example.money_tracker.models.dto.BillDto;
import com.example.money_tracker.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BillServiceImpl implements BillService {
    @Autowired
    BillMapper mapper;
    @Autowired
    BillRep rep;

    @Override
    public BillDto save(BillDto t) {
        return null;
    }

    @Override
    public BillDto findById(Long id) {
        return null;
    }

    @Override
    public List<BillDto> findAll() {
        return null;
    }

    @Override
    public BillDto delete(Long id) {
        return null;
    }
}
