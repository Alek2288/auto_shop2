package com.example.auto_shop.repository;

import com.example.auto_shop.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository <Model, Long> {
}
