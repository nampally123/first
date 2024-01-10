package com.Full.Stack.App.emsbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first-name")
    private String firstName;
    @Column(name = "last-name")
    private String lastName;
    @Column(name = "email-id",unique = true,nullable = false)
    private String email;

}
