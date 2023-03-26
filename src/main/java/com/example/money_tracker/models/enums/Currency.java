package com.example.money_tracker.models.enums;

public enum Currency {
    KGS(0),
    USD(87.42),
    EUR(94.2344),
    RUB(1.1468);

    double cost;

    Currency(double cost) {
        this.cost = cost;
    }
}
