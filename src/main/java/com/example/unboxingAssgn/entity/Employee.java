package com.example.unboxingAssgn.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(name = "employee_role",
            joinColumns =   @JoinColumn(name = "emp_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Role role;
}
