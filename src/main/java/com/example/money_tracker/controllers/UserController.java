package com.example.money_tracker.controllers;

import com.example.money_tracker.models.dto.UserDto;
import com.example.money_tracker.models.requests.UserRequest;
import com.example.money_tracker.services.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "Пользователь")
@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }
    @PostMapping("/save")
    @ApiOperation("Сохранение")
    ResponseEntity<?> create(@ModelAttribute UserRequest user) {
        try {
            return new ResponseEntity<>(service.create(user), HttpStatus.CREATED);
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
    ResponseEntity<List<UserDto>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

}
