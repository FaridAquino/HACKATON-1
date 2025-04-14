package com.example.demo.repository;

import com.example.demo.domain.calculadora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface calculadoraRepository extends JpaRepository<calculadora,Long> {
}
