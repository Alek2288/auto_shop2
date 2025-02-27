package com.example.auto_shop.service;

import com.example.auto_shop.model.Model;

import java.util.List;

public interface ModelService {

    Model create (Model model);

    Model getById(Long id);

    List<Model> getAll();

    Model update(Long id, Model newModel);

    void deleteById(Long id);
}
