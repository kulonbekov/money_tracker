package com.example.money_tracker.models.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
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
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String surname;
    @JsonFormat(pattern = "dd.MM.yyyy HH:mm")
    Date addDate;


    @PrePersist
    protected void onCreate() {
    addDate=new Date();
    }














}
