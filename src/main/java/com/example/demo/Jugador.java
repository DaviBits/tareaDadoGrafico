package com.example.demo;

public class Jugador {
    private String nombre;
    private int puntos;
    private int rondasGanadas;

    public Jugador(String nombre){
        this.nombre = nombre;
        this.puntos = 0;
        this.rondasGanadas=0;
    }

    public void incrementarRondasGanadas(){
        rondasGanadas++;
    }
    public int getRondasGanadas(){
        return rondasGanadas;
    }

    public String getNombre(){ return nombre; }

    public void setNombre(String nombre){ this.nombre = nombre; }

    public int getPuntos(){ return puntos; }

    public void setPuntos(int puntos){ this.puntos = puntos; }

}
