package com.example.auto_shop.config;

import lombok.Data;

@Data
public class ErrorResponse {

    private String message;

    private int httpCode;
}

