package com.example.money_tracker.models.enums;

public enum TypeOfIncome {
    SALARY("Зарплата"),
    BONUS("Бонус");

    String value;

    TypeOfIncome(String value) {
        this.value = value;
    }

    }
