package com.example.demo;

import javafx.scene.layout.VBox;

public class ControladorJuego3D  {
    private Tablero tablero;
    private ManejadorJuego manejador;

    public ControladorJuego3D(Tablero tablero, ManejadorJuego manejador){
        this.tablero=tablero;
        this.manejador=manejador;
        CentroTablero centro = new CentroTablero(this);
        tablero.setCentroTablero(centro);
    }

    public void jugar (){
        Jugador jugador = manejador.jugar();


        //implementar ell flujo de los "turnos"

        //cambia los dados de los jugadores
        tablero.actualizarDados(manejador.getJuego3Dados().getValorDado1(),
        manejador.getJuego3Dados().getValorDado2(), manejador.getJuego3Dados().getValorDado3());
        //cambiar los puntos
        tablero.actualizarJugador(jugador);

        if (manejador.getRondaActual() >= manejador.getNumeroDeRondas() * 4) {
            Jugador ganador = manejador.getGanador();
            tablero.mostrarGanador(ganador);
        }

    }

    public void lanzar3Dados(){

    }
}
