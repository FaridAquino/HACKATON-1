package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class calculadora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
