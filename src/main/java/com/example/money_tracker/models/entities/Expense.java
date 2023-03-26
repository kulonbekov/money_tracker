package com.example.money_tracker.models.entities;

import com.example.money_tracker.models.enums.Currency;
import com.example.money_tracker.models.enums.PurposeExpense;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "tb_expense")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    PurposeExpense purposeExpense;
    int sum;
    Currency currency;
    @ManyToOne
    @JoinColumn(name = "bill_id")
    Bill billName;
    Date addDate;
    Date updateDate;



    @PrePersist
    protected void onCreate() {
        addDate=new Date();
        updateDate=new Date();
    }


    @PreUpdate
    protected void OnUpdate(){
        updateDate=new Date();
    }


}
