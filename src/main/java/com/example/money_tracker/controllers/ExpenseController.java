package com.example.money_tracker.controllers;

import com.example.money_tracker.models.dto.ExpenseDto;
import com.example.money_tracker.models.requests.ExpenseRequest;
import com.example.money_tracker.services.ExpenseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "Расход")
@RestController
@RequestMapping("api/v1/expense")
public class ExpenseController {
    private ExpenseService service;

    public ExpenseController(ExpenseService service) {
        this.service = service;
    }

    @PostMapping("/save")
    @ApiOperation("Сохранение")
    ResponseEntity<?> create(@ModelAttribute ExpenseRequest expense) {
        try {
            return new ResponseEntity<>(service.create(expense), HttpStatus.CREATED);
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
    ResponseEntity<List<ExpenseDto>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

}
