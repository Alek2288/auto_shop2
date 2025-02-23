package com.example.auto_shop.service;

import com.example.auto_shop.model.Color;
import com.example.auto_shop.repository.ColorRepository;
import org.springframework.stereotype.Service;


public interface ColorService {

    Color create (Color color);
}
