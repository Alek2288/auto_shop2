package com.example.auto_shop.service;

import com.example.auto_shop.model.Brand;

import java.util.List;

public interface BrandService {

    Brand create (Brand brand);

    Brand getById(Long id);

    List<Brand> getAll();

    Brand update(Long id, Brand newBrand);

    void deleteById(Long id);
}
