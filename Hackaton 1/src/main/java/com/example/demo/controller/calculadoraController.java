package com.example.demo.controller;

import com.example.demo.service.calculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class calculadoraController {

    @Autowired
    private calculadoraService service;

    @GetMapping("/divide/{a}/{b}")
    public ResponseEntity<?> dividir(@PathVariable Long a, @PathVariable Long b){ //? es como un template
        try {
            Double result= service.divide(a,b);
            return ResponseEntity.ok(result.toString());
        }   catch (IllegalArgumentException e){
            return ResponseEntity.badRequest().body("NO NO" + e.getMessage());
        }   catch (ArithmeticException e){
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body("ERROR ARTIMETICO: " + e.getMessage());
        }   catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Errror interno inesperado" +e.getMessage());
        }
    }

    @GetMapping("/resta/{a}/{b}")
    public ResponseEntity<?> resta(@PathVariable Long a, @PathVariable Long b){
        try {
            Long result= service.resta(a,b);
            return ResponseEntity.ok(result.toString());
        }   catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body("ERROR: " + e.getMessage());
        }
    }
}
