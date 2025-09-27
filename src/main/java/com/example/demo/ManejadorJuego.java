package com.example.demo;


import java.util.ArrayList;

public class ManejadorJuego {

    private Juego3Dados juego3Dados;
    private Jugador jugador1;
    private Jugador jugador2;
    private Jugador jugador3;
    private Jugador jugador4;
    private int numeroDeRondas;
    private Jugador ganador;
    //rondaActual, es el turno del jugador
    private int turnoJugador;

    ManejadorJuego() {
        juego3Dados = new Juego3Dados();
        jugador1 = new Jugador("David1");
        jugador2 = new Jugador("David la secuela");
        jugador3 = new Jugador("David requiem");
        jugador4 = new Jugador("David recargado");
        numeroDeRondas = 3;
        turnoJugador = 0;
        
    }

    ManejadorJuego(int numeroDeRondas) {
        juego3Dados = new Juego3Dados();
        turnoJugador = 0;
        jugador1 = new Jugador("David1");
        jugador2 = new Jugador("David la secuela");
        jugador3 = new Jugador("David requiem");
        jugador4 = new Jugador("David recargado");
        this.numeroDeRondas = numeroDeRondas;
    }

    public void iniciarJuego() {
        int numRondas = numeroDeRondas;

        do {
            System.out.println("RONDA : " + (numRondas));

            jugar(jugador1);
            jugar(jugador2);
            jugar(jugador3);
            jugar(jugador4);
            numRondas--;


            mostrarRonda();
        } while (numRondas > 0);


        Jugador ganador = getGanador();
        System.out.println("Ganador: " + ganador);


    }


    public int turnoJugador(){
        return (1+turnoJugador)%4;
    }

    public void jugar(Jugador jugador) {
        juego3Dados.lanzar3Dados();
        jugador.setPuntos(jugador.getPuntos() + juego3Dados.suma3Dados());
        System.out.println(juego3Dados.misDados());
        if (juego3Dados.gane()) {
            jugador.incrementarRondasGanadas();
        }
    }

    public Jugador jugar() {
        Jugador jugador = switch (turnoJugador()) {
            case 0 -> jugador1;
            case 1 -> jugador2;
            case 2 -> jugador3;
            case 3 -> jugador4;
            default -> null;
        };

        juego3Dados.lanzar3Dados();

        jugador.setPuntos(jugador.getPuntos() + juego3Dados.suma3Dados());
        System.out.println(juego3Dados.misDados() );
        if (juego3Dados.gane()) {
            jugador.incrementarRondasGanadas();
        }
        turnoJugador++;
        return jugador;
    }

    public int getRondaActual() {
        return turnoJugador;
    }

    public Jugador getGanador() {
        ArrayList<Jugador> jugadores= new ArrayList<>();
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        jugadores.add(jugador3);
        jugadores.add(jugador4);

        ganador=jugador1;

        for(Jugador jugador: jugadores){
            if(ganador.getPuntos()<jugador.getPuntos()){
                ganador=jugador;
            }
        }

        return ganador;


    }

    public String mostrarRonda() {
        System.out.println(jugador1);
        System.out.println(jugador2);
        System.out.println(jugador3);
        System.out.println(jugador4);
        return jugador1.toString();
    }

    public int getNumeroDeRondas() {
        return numeroDeRondas;
    }

    public Juego3Dados getJuego3Dados() {
        return juego3Dados;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public Jugador getJugador3() {
        return jugador3;
    }

    public Jugador getJugador4() {
        return jugador4;
    }

}