package com.example.auto_shop.config;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ErrorResponse {

    private String message;

    @JsonFormat(pattern = "YYYY.MM.dd HH:ss")
    private LocalDateTime date;
}

