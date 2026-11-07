package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name = "EspecieCaracteristicas")
public class EspecieCaracteristicas {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id_especie;
    private long id_caracteristica;

    public EspecieCaracteristicas(long id_especie, long id_caracteristica) {
        this.id_especie = id_especie;
        this.id_caracteristica = id_caracteristica;
    }

    public EspecieCaracteristicas() {
    }

    public long getId_especie() {
        return id_especie;
    }

    public void setId_especie(long id_especie) {
        this.id_especie = id_especie;
    }

    public long getId_caracteristica() {
        return id_caracteristica;
    }

    public void setId_caracteristica(long id_caracteristica) {
        this.id_caracteristica = id_caracteristica;
    }

    @Override
    public String toString() {
        return "EspecieCaracteristicas [id_especie=" + id_especie + ", id_caracteristica=" + id_caracteristica + "]";
    }
}