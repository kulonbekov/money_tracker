package com.example.money_tracker.models.entities;

import com.example.money_tracker.models.enums.Role;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String email;
    String password;
    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    @Fetch(FetchMode.JOIN)
    List<Role> roles;

}
