package com.example.auto_shop.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "clients")
@Getter
@Setter
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "phone_number",unique = true)
    private String phoneNumber;

    @Column(name = "passport", nullable = false, unique = true)
    private Integer passport;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Auto> autos;
}
