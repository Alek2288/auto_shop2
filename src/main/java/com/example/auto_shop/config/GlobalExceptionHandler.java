package com.example.auto_shop.config;

import com.example.auto_shop.exception.EmptyFieldException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmptyFieldException.class)
    public ErrorResponse handleEmptyFieldException(EmptyFieldException ex){
        return new ErrorResponse(ex.getMessage(), LocalDateTime.now());
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ErrorResponse handleEntityNotFoundException(EntityNotFoundException ex){
        return new ErrorResponse(ex.getMessage(), LocalDateTime.now());
    }
}
