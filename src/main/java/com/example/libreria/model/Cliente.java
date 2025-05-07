package com.example.libreria.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    private String direccion;

    @OneToMany(mappedBy = "cliente")
    private Set<Venta> ventas = new HashSet<>();

    // Getters y Setters
}