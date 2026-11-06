package com.example.model;

public class EstadoConservacion {
    private long id_estado;
    private String nombre;

        public EstadoConservacion(long id_estado, String nombre) {
        this.id_estado = id_estado;
        this.nombre = nombre;
    }

    public EstadoConservacion(String nombre) {
        this.nombre = nombre;
    }

    public EstadoConservacion() {
    }

    public long getId_estado() {
        return id_estado;
    }

    public void setId_estado(long id_estado) {
        this.id_estado = id_estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

        @Override
    public String toString() {
        return "EstadoConservacion [id_estado=" + id_estado + ", nombre=" + nombre + "]";
    }
}
