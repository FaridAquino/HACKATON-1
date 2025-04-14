package com.example.demo;

import com.example.demo.exceptions.ErrorMessage;
import com.example.demo.exceptions.huanaException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(huanaException.class)
    public ResponseEntity<ErrorMessage> handlehuanaException(huanaException ex){
        ErrorMessage error=new ErrorMessage(ex.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
    }
}
