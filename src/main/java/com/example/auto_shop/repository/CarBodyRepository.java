package com.example.auto_shop.repository;

import com.example.auto_shop.model.CarBody;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarBodyRepository extends JpaRepository <CarBody, Long> {
}
