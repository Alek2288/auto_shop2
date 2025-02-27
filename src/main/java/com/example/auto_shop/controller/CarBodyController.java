package com.example.auto_shop.controller;


import com.example.auto_shop.model.CarBody;
import com.example.auto_shop.service.CarBodyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/carBodies")
@RequiredArgsConstructor

public class CarBodyController {

    private final CarBodyService carBodyService;

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable ("id") Long id) {
        carBodyService.deleteById(id);
    }

    @GetMapping
    public ResponseEntity<List<CarBody>> getAll() {
        return ResponseEntity.ok(carBodyService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarBody> getById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(carBodyService.getById(id));
    }
    @PostMapping
    public ResponseEntity<CarBody> create(@RequestBody CarBody carBody) {
        return ResponseEntity.ok(carBodyService.create(carBody));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CarBody> update(@PathVariable("id") Long id, @RequestBody CarBody newCarBody) {
        return ResponseEntity.ok(carBodyService.update(id, newCarBody));
    }
}