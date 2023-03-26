package com.example.money_tracker.models.entities;

import com.example.money_tracker.models.enums.Currency;
import com.example.money_tracker.models.enums.TypeOfIncome;
import com.fasterxml.jackson.annotation.JsonFormat;
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
    @Enumerated(EnumType.STRING)
    TypeOfIncome typeOfIncome;
    double sum;
    @ManyToOne
    @JoinColumn(name = "bill_id")
    Bill bill;
    @JsonFormat(pattern = "dd.MM.yyyy HH:mm")
    Date addDate;
    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;



    @PrePersist
    protected void onCreate() {
        addDate=new Date();
    }


}
