package com.sprigboot_crud.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name ="first_name", nullable = false)
    private String firstname;
    @Column(name ="last_name", nullable = false)
    private String lastname;
    @Column(name ="email", nullable = false, unique = true)
    private String email;
}
