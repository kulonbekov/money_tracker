package com.example.money_tracker.models.entities;

import com.example.money_tracker.models.enums.Currency;
import com.example.money_tracker.models.enums.Type;
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
@Table(name = "tb_bill")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String billName;
    boolean active;

    @PrePersist
    protected void onCreate() {
        active = true;
    }

}
