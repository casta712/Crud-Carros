package com.dev.casta.SpringCrud.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private int anno;

    public Auto(Long id) {
        this.id = id;
    }

    private int capacidad;
    private double precio;
}
