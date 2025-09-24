package com.example.demo;

public class Juego3Dados {

    private Dado d1;
    private Dado d2;
    private Dado d3;

    public  Juego3Dados() {
        d1 = new Dado();
        d2 = new Dado();
        d3 = new Dado();
    }

    public void lanzar3Dados(){
        d1.lanzar();
        d2.lanzar();
        d3.lanzar();
    }

    public boolean sonLos3Iguales(){
        return(d1.getValor() == d2.getValor() && d1.getValor() == d3.getValor());
    }

    public int suma3Dados(){
        return d1.getValor() + d2.getValor() + d3.getValor();
    }

    public boolean gane(){
        return(sonLos3Iguales() || suma3Dados()>14);
    }

    public int getValorDado1(){
        return d1.getValor();
    }
    public int getValorDado2(){
        return d2.getValor();
    }
    public int getValorDado3(){
        return d3.getValor();
    }

    public String misDados(){
        return getValorDado1()+","+getValorDado2()+","+getValorDado3();
    }

}
