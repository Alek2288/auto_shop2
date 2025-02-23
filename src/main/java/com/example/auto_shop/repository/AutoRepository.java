package com.example.auto_shop.repository;

import com.example.auto_shop.model.Auto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutoRepository extends JpaRepository <Auto, Long> {
}
