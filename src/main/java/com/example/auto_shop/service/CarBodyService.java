package com.example.auto_shop.service;

import com.example.auto_shop.model.CarBody;

import java.util.List;


public interface CarBodyService {

    CarBody create (CarBody carBody);

    CarBody getById(Long id);

    List<CarBody> getAll();

    CarBody update (Long id, CarBody newCarBody);

    void deleteById(Long id);
}