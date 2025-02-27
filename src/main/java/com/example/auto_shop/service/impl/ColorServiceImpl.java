package com.example.auto_shop.service.impl;

import com.example.auto_shop.exception.EmptyFieldException;
import com.example.auto_shop.model.Color;
import com.example.auto_shop.repository.ColorRepository;
import com.example.auto_shop.service.ColorService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ColorServiceImpl implements ColorService {

    private final ColorRepository colorRepository;

    @Override
    public Color create(Color color) {
        if(color.getName().isEmpty()) {
            throw new EmptyFieldException("Поле name не может быть пустым");
        }
        return colorRepository.save(color);
    }

    @Override
    public Color getById(Long id) {
        return colorRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Не найден"));
    }

    @Override
    public List<Color> getAll() {
        return colorRepository.findAll();
    }

    @Override
    public Color update(Long id, Color newColor) {
        Color color = colorRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Не найден"));
        if(newColor.getName().isEmpty()) {
            throw new EmptyFieldException("Не может быть пустым");
        }
        color.setName(newColor.getName());
        return colorRepository.save(color);
    }

    @Override
    public void deleteById(Long id) {
        if (!colorRepository.existsById(id)) {
            throw new EntityNotFoundException("Не найден");
        }
        colorRepository.deleteById(id);
    }
}

