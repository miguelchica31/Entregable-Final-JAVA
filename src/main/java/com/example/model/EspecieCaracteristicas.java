package com.example.model;

public class EspecieCaracteristicas {

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