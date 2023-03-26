package com.example.money_tracker.dao;

import com.example.money_tracker.models.entities.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRep extends JpaRepository<Expense,Long> {
}
