package com.example.demo.entity;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "members")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50, nullable = false, unique = true)
    private String email;

    @Column(length = 16, nullable = false)
    private String password;
}
