package com.example.money_tracker.models.entities;

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
    String login;
    String password;
    String keyword;
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
