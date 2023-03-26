package com.example.money_tracker.dao;

import com.example.money_tracker.models.entities.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeRep extends JpaRepository<Income,Long> {
}
