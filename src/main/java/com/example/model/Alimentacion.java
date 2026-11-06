package com.example.model;


public class Alimentacion {

    private long id_alimentacion;
    private String nombre;

    public Alimentacion(long id_alimentacion, String nombre) {
        this.id_alimentacion = id_alimentacion;
        this.nombre = nombre;
    }

    public Alimentacion(String nombre) {
        this.nombre = nombre;
    }

    public Alimentacion() {
    }

    public long getId_alimentacion() {
        return id_alimentacion;
    }

    public void setId_alimentacion(long id_alimentacion) {
        this.id_alimentacion = id_alimentacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Alimentacion [id_alimentacion=" + id_alimentacion + ", nombre=" + nombre + "]";
    }
}