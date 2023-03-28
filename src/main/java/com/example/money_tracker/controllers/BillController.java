package com.example.money_tracker.controllers;

import com.example.money_tracker.models.dto.BillDto;
import com.example.money_tracker.models.requests.BillRequest;
import com.example.money_tracker.services.BillService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "Счет")
@RestController
@RequestMapping("/api/v1/bill")
public class BillController {

    private BillService service;

    public BillController(BillService service) {
        this.service = service;
    }

    @PostMapping("/save")
    @ApiOperation("Сохранение")
    ResponseEntity<?> create(@ModelAttribute BillRequest bill) {
        try {
            return new ResponseEntity<>(service.create(bill), HttpStatus.CREATED);
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
    ResponseEntity<List<BillDto>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

//
//    @DeleteMapping("/delete")
//    @ApiOperation("Удаление")
//    ResponseEntity<?> delete(@RequestParam Long id) {
//        try {
//            return ResponseEntity.ok(service.delete(id));
//        } catch (Exception e) {
//            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
//        }
//    }


}
