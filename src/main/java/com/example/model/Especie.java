package com.example.model;

public class Especie {

    private long id_especie;
    private String nombre;
    private long id_tipo;
    private long id_alimentacion;

    public  Especie (long id_especie, String nombre, long id_tipo, long id_alimentacion){

        this.id_especie = id_especie;
        this.nombre = nombre;
        this.id_tipo = id_tipo;
        this.id_alimentacion = id_alimentacion;

    }

    public  Especie ( String nombre, long id_tipo, long id_alimentacion){

        this.nombre = nombre;
        this.id_tipo = id_tipo;
        this.id_alimentacion = id_alimentacion;

    }

    public Especie(){

    }

    public long getId_especie() {
        return id_especie;
    }

    public String getNombre() {
        return nombre;
    }

    public long getId_tipo() {
        return id_tipo;
    }

    public long getId_alimentacion() {
        return id_alimentacion;
    }

    public void setId_especie(long id_especie) {
        this.id_especie = id_especie;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId_tipo(long id_tipo) {
        this.id_tipo = id_tipo;
    }

    public void setId_alimentacion(long id_alimentacion) {
        this.id_alimentacion = id_alimentacion;
    }

    @Override
    public String toString(){
        return "Especie [id=" + id_especie + ", nombre=" + nombre + ", id_tipo=" + id_tipo + ", id_alimentacion=" + id_alimentacion + "]";
    }


}
