package com.example.auto_shop.service.impl;

import com.example.auto_shop.exception.EmptyFieldException;
import com.example.auto_shop.model.Color;
import com.example.auto_shop.model.Model;
import com.example.auto_shop.service.ModelService;
import com.example.auto_shop.repository.ModelRepository;
import jakarta.persistence.EntityNotFoundException;

import java.util.List;

public class ModelServiceImpl implements ModelService {

    private ModelRepository modelRepository ;

    @Override
    public Model create(Model model) {
        if(model.getName().isEmpty()) {
            throw new EmptyFieldException("Поле name не может быть пустым");
        }
        return modelRepository.save(model);
    }

    @Override
    public Model getById(Long id) {
        return modelRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Не найден"));
    }

    @Override
    public List<Model> getAll() {
        return modelRepository.findAll();
    }

    @Override
    public Model update(Long id, Model newModel) {
        Model model = modelRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Не найден"));
        if(newModel.getName().isEmpty()) {
            throw new EmptyFieldException("Не может быть пустым");
        }
        model.setName(newModel.getName());
        return modelRepository.save(model);
    }

    @Override
    public void deleteById(Long id) {
        if (!modelRepository.existsById(id)) {
            throw new EntityNotFoundException("Не найден");
        }
        modelRepository.deleteById(id);
    }
}
