package com.example.model;

public class Caracteristicas {

    private long id_caracteristicas;
    private String descripcion;

    public Caracteristicas(long id_caracteristicas, String descripcion) {

        this.id_caracteristicas = id_caracteristicas;
        this.descripcion = descripcion;
    }

    public Caracteristicas(String descripcion) {
        this.descripcion = descripcion;
    }

    public Caracteristicas() {
    }
    
    public long getId() {
        return id_caracteristicas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(long id_caracteristicas) {
        this.id_caracteristicas = id_caracteristicas;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
        @Override
    public String toString() {

        return "Animal [id=" + id_caracteristicas + ", Descripción=" + descripcion +"]";
        
    }

}
