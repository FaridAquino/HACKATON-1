package com.example.demo.service;

import com.example.demo.repository.calculadoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class calculadoraService {
    @Autowired
    private calculadoraRepository repository;

    public Double divide(Long a, Long b){

        if (a==null || b== null){
            throw new IllegalArgumentException(" a y b no pueden ser iguales");
        }

        if (b==0){
            throw new ArithmeticException("División por cero no permitida");
        }

        return a.doubleValue()/b.doubleValue();

    }
}
