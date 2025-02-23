package com.example.auto_shop.repository;

import com.example.auto_shop.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository <Brand, Long> {
}
