package com.example.auto_shop.repository;

import com.example.auto_shop.model.Color;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorRepository extends JpaRepository <Color, Long> {
}
