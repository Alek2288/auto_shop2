package com.example.auto_shop.service.impl;

import com.example.auto_shop.exception.EmptyFieldException;
import com.example.auto_shop.model.Brand;
import com.example.auto_shop.model.Model;
import com.example.auto_shop.repository.BrandRepository;
import com.example.auto_shop.service.BrandService;
import jakarta.persistence.EntityNotFoundException;

import java.util.List;

public class BrandServiceImpl implements BrandService {

    private BrandRepository brandRepository;

    @Override
    public Brand create(Brand brand) {
        if(brand.getName().isEmpty()) {
            throw new EmptyFieldException("Поле name не может быть пустым");
        }
        return brandRepository.save(brand);
    }

    @Override
    public Brand getById(Long id) {
        return brandRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Не найден"));
    }

    @Override
    public List<Brand> getAll() {
        return brandRepository.findAll();
    }

    @Override
    public Brand update(Long id, Brand newBrand) {
        Brand brand = brandRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Не найден"));
        if(newBrand.getName().isEmpty()) {
            throw new EmptyFieldException("Не может быть пустым");
        }
        brand.setName(newBrand.getName());
        return brandRepository.save(brand);
    }

    @Override
    public void deleteById(Long id) {
        if (!brandRepository.existsById(id)) {
            throw new EntityNotFoundException("Не найден");
        }
        brandRepository.deleteById(id);
    }
}
