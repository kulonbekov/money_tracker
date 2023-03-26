package com.example.money_tracker.dao;

import com.example.money_tracker.models.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRep extends JpaRepository<Bill, Long> {
}
