package com.example.money_tracker.services.impl;

import com.example.money_tracker.dao.BillRep;
import com.example.money_tracker.mappers.BillMapper;
import com.example.money_tracker.models.dto.BillDto;
import com.example.money_tracker.services.BillService;

import java.util.List;

public class BillServiceImpl implements BillService {

    BillMapper mapper = BillMapper.INSTANCE;

   private BillRep rep;

    public BillServiceImpl(BillRep rep) {
        this.rep = rep;
    }

    @Override
    public BillDto save(BillDto dto) {
        return mapper.toDto(rep.save(mapper.toEntity(dto)));
    }

    @Override
    public BillDto findById(Long id) {
        return mapper.toDto(rep.findById(id).orElseThrow(()->new RuntimeException("Bill not found")));
    }

    @Override
    public List<BillDto> findAll() {
        return mapper.toDtos(rep.findAll());
    }

    @Override
    public BillDto delete(Long id) {
        return null;
    }
}
