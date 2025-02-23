package com.example.auto_shop.service.impl;

import com.example.auto_shop.exception.EmptyFieldException;
import com.example.auto_shop.model.Color;
import com.example.auto_shop.repository.ColorRepository;
import com.example.auto_shop.service.ColorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ColorServiceImpl implements ColorService {

    private final ColorRepository colorRepository;

    @Override
    public Color create(Color color) {
        if(color.getName().isEmpty()) {
            throw new EmptyFieldException("Поле nme не может быть пустым");
        }
        return colorRepository.save(color);
    }
}
