package com.example.model;

public class EspecieHabitad {

    private long id_especie;
    private long id_habitad;

    public EspecieHabitad(long id_especie,long id_habitad){

        this.id_especie = id_especie;
        this.id_habitad = id_habitad;

    }

    public EspecieHabitad(){

    }

    public long getId_especie() {
        return id_especie;
    }

    public void setId_especie(long id_especie) {
        this.id_especie = id_especie;
    }

    public long getId_habitad() {
        return id_habitad;
    }

    public void setId_habitad(long id_habitad) {
        this.id_habitad = id_habitad;
    }

    @Override 
    public String toString (){
        return "Especie Habitad [id=" + id_especie + ", id_especie=" + id_especie + ", id_habitad=" + id_habitad + "]";
    }

}
