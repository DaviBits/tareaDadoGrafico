package com.example.demo;
import java.util.Random;

public class Dado {

    private int valor;         // Valor actual del dado
    private final Random rnd;  // Generador de números aleatorios

    public Dado() {
        rnd = new Random();
        lanzar(); // Inicializamos el dado con un valor aleatorio
    }

    /**
     * Lanza el dado (genera un valor entre 1 y 6).
     */
    public void lanzar() {
        valor = rnd.nextInt(6) + 1; // de 1 a 6
    }

    /**
     * Devuelve el valor actual del dado.
     */
    public int getValor() {
        return valor;
    }
}
