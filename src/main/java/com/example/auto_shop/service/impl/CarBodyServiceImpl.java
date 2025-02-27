package com.example.auto_shop.service.impl;

import com.example.auto_shop.exception.EmptyFieldException;
import com.example.auto_shop.model.CarBody;
import com.example.auto_shop.repository.CarBodyRepository;
import com.example.auto_shop.service.CarBodyService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarBodyServiceImpl implements CarBodyService {

    private final CarBodyRepository carBodyRepository;

    @Override
    public CarBody create(CarBody carBody) {
        if (carBody.getName().isEmpty()) {
            throw new EmptyFieldException("Поле name не может быть пустым");
        }
        return carBodyRepository.save(carBody);
    }

    @Override
    public CarBody getById(Long id) {
        return carBodyRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Не найден"));
    }

    @Override
    public List<CarBody> getAll() {
        return carBodyRepository.findAll();
    }

    @Override
    public CarBody update(Long id, CarBody newCarBody) {
        CarBody carBody = carBodyRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Не найден"));
        if(newCarBody.getName().isEmpty()) {
            throw new EmptyFieldException("Не может быть пустым");
        }
        carBody.setName(newCarBody.getName());
        return carBodyRepository.save(carBody);
    }

    @Override
    public void deleteById(Long id) {
        if (!carBodyRepository.existsById(id)) {
            throw new EntityNotFoundException("Не найден");
        }
        carBodyRepository.deleteById(id);
    }
}
