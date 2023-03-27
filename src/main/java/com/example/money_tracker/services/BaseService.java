package com.example.money_tracker.services;

import java.util.List;

public interface BaseService <Dto>{

    Dto save(Dto dto);
    Dto findById(Long id);
    List<Dto> findAll();
    Dto delete(Long id);

}
