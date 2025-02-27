package com.example.auto_shop.controller;


import com.example.auto_shop.model.Color;
import com.example.auto_shop.service.ColorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/colors")
@RequiredArgsConstructor

public class ColorController {

    private final ColorService colorService;

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable ("id") Long id) {
        colorService.deleteById(id);
    }

    @GetMapping
    public ResponseEntity<List<Color>> getAll() {
        return ResponseEntity.ok(colorService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Color> getById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(colorService.getById(id));
    }
    @PostMapping
    public ResponseEntity<Color> create(@RequestBody Color color) {
        return ResponseEntity.ok(colorService.create(color));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Color> update(@PathVariable("id") Long id, @RequestBody Color newColor) {
        return ResponseEntity.ok(colorService.update(id, newColor));
    }
}
