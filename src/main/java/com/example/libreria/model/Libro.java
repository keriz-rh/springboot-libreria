package com.example.libreria.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String isbn;
    private Double precio;
    private Integer stock;

    @ManyToMany
    @JoinTable(
        name = "libro_autor",
        joinColumns = @JoinColumn(name = "libro_id"),
        inverseJoinColumns = @JoinColumn(name = "autor_id")
    )
    private Set<Autor> autores = new HashSet<>();

    @OneToMany(mappedBy = "libro")
    private Set<DetalleVenta> detallesVenta = new HashSet<>();

    // Getters y Setters (¡Generarlos en tu IDE!)
}