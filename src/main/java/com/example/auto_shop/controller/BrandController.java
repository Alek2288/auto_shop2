package com.example.auto_shop.controller;

import com.example.auto_shop.model.Brand;
import com.example.auto_shop.service.BrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/brands")
@RequiredArgsConstructor

public class BrandController {

    private final BrandService brandService;

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        brandService.deleteById(id);
    }

    @GetMapping
    public ResponseEntity<List<Brand>> getAll() {
        return ResponseEntity.ok(brandService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Brand> getById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(brandService.getById(id));
    }
    @PostMapping
    public ResponseEntity<Brand> create(@RequestBody Brand brand) {
        return ResponseEntity.ok(brandService.create(brand));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Brand> update(@PathVariable("id") Long id, @RequestBody Brand newBrand) {
        return ResponseEntity.ok(brandService.update(id, newBrand));
    }
}
