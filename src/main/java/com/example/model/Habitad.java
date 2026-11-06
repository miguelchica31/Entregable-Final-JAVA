package com.example.model;

public class Habitad {

    private long id_habitad;
    private String nombre;

    public Habitad(long id_habitad, String nombre){

        this.id_habitad = id_habitad;
        this.nombre = nombre;

    }

    public Habitad(String nombre){

        this.nombre = nombre;

    }

    public Habitad(){

    }

    public long getId_habitad() {
        return id_habitad;
    }

    public void setId_habitad(long id_habitad) {
        this.id_habitad = id_habitad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public  String toString(){
        return "Habitad [id=" + id_habitad + ", nombre=" + nombre + "]";
    }

}
