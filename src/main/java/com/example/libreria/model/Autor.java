package com.example.libreria.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String nacionalidad;

    @ManyToMany(mappedBy = "autores")
    private Set<Libro> libros = new HashSet<>();

    // Getters y Setters
}