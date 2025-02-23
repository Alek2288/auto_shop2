package com.example.auto_shop.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.StreamingHttpOutputMessage;

import java.time.LocalDate;

@Entity
@Table(name = "autos")
@Getter
@Setter
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "release_date")
    private LocalDate releaseDate;

    @Column(name = "vin_number", unique = true, nullable = false)
    private String vinNumber;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "color_id")
    private Color color;

    @ManyToOne
    @JoinColumn(name = "body_id")
    private CarBody body;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
}