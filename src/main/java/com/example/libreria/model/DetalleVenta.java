package com.example.libreria.model;

import jakarta.persistence.*;

@Entity
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer cantidad;
    private Double subtotal;

    @ManyToOne
    @JoinColumn(name = "libro_id")
    private Libro libro;

    @ManyToOne
    @JoinColumn(name = "venta_id")
    private Venta venta;

    // Getters y Setters
}