package com.example.model;

public class TipoAnimal {

    private long id_tipo;
    private String nombre;

    public TipoAnimal(long id_tipo, String nombre){

        this.id_tipo = id_tipo;
        this.nombre = nombre;

    }

    public TipoAnimal(String nombre){

        this.nombre = nombre;

    }

    public TipoAnimal(){

    }

    public long getId() {
        return id_tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(long id_tipo) {
        this.id_tipo = id_tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "Tipo Animal [id=" + id_tipo + ", nombre=" + nombre +"]";
    }
}
