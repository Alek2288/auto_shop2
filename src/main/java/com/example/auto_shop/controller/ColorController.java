package com.example.auto_shop.controller;


import com.example.auto_shop.model.Color;
import com.example.auto_shop.service.ColorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/colors")
@RequiredArgsConstructor

public class ColorController {

    private final ColorService colorService;

    @PostMapping
    public ResponseEntity<Color> create(@RequestBody Color color) {
        return ResponseEntity.ok(colorService.create(color));
    }
}
