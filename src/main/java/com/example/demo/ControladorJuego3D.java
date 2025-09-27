package com.example.demo;

import javafx.scene.layout.VBox;

import java.awt.*;

public class ControladorJuego3D  {
    private Tablero tablero;
    private ManejadorJuego manejador;
    private int numRonda;

    public ControladorJuego3D(Tablero tablero, ManejadorJuego manejador){
        this.tablero=tablero;
        this.manejador=manejador;
        CentroTablero centro = new CentroTablero(this);
        tablero.setCentroTablero(centro);
        numRonda=2;
    }

    public void jugar (){


        Jugador jugador = manejador.jugar();
        if(manejador.getRondaActual()%4==0&&numRonda<=3){
            tablero.actualizarRondaUI(numRonda);
            numRonda++;
        }

        //implementar ell flujo de los "turnos"

        //cambia los dados de los jugadores
        tablero.actualizarDados(manejador.getJuego3Dados().getValorDado1(),
        manejador.getJuego3Dados().getValorDado2(), manejador.getJuego3Dados().getValorDado3());
        //cambiar los puntos
        tablero.actualizarJugador(jugador);


        if ((manejador.getRondaActual() ==12)) {
            Jugador ganador = manejador.getGanador();
            tablero.mostrarGanador(ganador);
            tablero.eliminarBotonLazar();
        }



    }

    public void lanzar3Dados(){
        Label nombreGanador=new Label();

    }
}
