package com.example.money_tracker.service;

import java.util.List;

public interface BaseService <Dto>{
    Dto save(Dto t);
    Dto findById(Long id);
    List<Dto> findAll();
    Dto delete(Long id);

}
