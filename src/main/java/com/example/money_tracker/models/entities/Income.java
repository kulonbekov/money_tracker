package com.example.money_tracker.models.entities;

import com.example.money_tracker.models.enums.Currency;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "tb_income")
public class Income {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String designation;
    int sum;
    Currency currency;
    @ManyToOne
    @JoinColumn(name = "bill_id")
    Bill bill;
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
