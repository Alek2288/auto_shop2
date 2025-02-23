package com.example.auto_shop.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "car_bodies")
@Getter
@Setter
public class CarBody {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, unique = true )
    private String name;

    @OneToMany(mappedBy = "body", cascade = CascadeType.ALL)
    private List<Auto> autos;
}
