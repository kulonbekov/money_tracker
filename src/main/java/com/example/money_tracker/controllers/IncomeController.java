package com.example.money_tracker.controllers;

import com.example.money_tracker.models.dto.IncomeDto;
import com.example.money_tracker.models.requests.IncomeRequest;
import com.example.money_tracker.services.IncomeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "Доход")
@RestController
@RequestMapping("api/v1/income")
public class IncomeController {
    private IncomeService service;

    public IncomeController(IncomeService service) {
        this.service = service;
    }

    @PostMapping("/save")
    @ApiOperation("Сохранение")
    ResponseEntity<?> create(@ModelAttribute IncomeRequest income) {
        try {
            return new ResponseEntity<>(service.create(income), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
        }
    }


    @GetMapping("/find/by/id")
    @ApiOperation("Поиск кинотеатра по id")
    ResponseEntity<?> findById(@RequestParam Long id) {

        return new ResponseEntity<>(service.findById(id), HttpStatus.FOUND);

    }


    @GetMapping("/find/all")
    @ApiOperation("Вывод всех кинотеатров")
    ResponseEntity<List<IncomeDto>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

}
