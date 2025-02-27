package com.example.auto_shop.service;

import com.example.auto_shop.model.Color;


import java.util.List;


public interface ColorService {

    Color create (Color color);

    Color getById(Long id);

    List<Color> getAll();

    Color update(Long id, Color newColor);

    void deleteById(Long id);
}
