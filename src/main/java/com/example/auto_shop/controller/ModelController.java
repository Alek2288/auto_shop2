package com.example.auto_shop.controller;
import com.example.auto_shop.model.Model;
import com.example.auto_shop.service.ModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/models")
@RequiredArgsConstructor

public class ModelController {

    private final ModelService modelService;

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        modelService.deleteById(id);
    }

    @GetMapping
    public ResponseEntity<List<Model>> getAll() {
        return ResponseEntity.ok(modelService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Model> getById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(modelService.getById(id));
    }
    @PostMapping
    public ResponseEntity<Model> create(@RequestBody Model model) {
        return ResponseEntity.ok(modelService.create(model));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Model> update(@PathVariable("id") Long id, @RequestBody Model newModel) {
        return ResponseEntity.ok(modelService.update(id, newModel));
    }
}
