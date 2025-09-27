package com.example.demo;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class JugadorUI extends VBox {
    private Jugador jugador;
    private Label nombreLabel;
    private Label puntosLabel;

    public JugadorUI(Jugador jugador){
        Font pressStart = Font.loadFont(
                getClass().getResourceAsStream("/PressStart2P-Regular.ttf"),
                32
        );

        Font pressStartChica = Font.loadFont(
                getClass().getResourceAsStream("/PressStart2P-Regular.ttf"),
                18
        );

        this.jugador = jugador;

        nombreLabel = new Label();
        puntosLabel = new Label();

        nombreLabel.setText(jugador.getNombre());
        puntosLabel.setText(jugador.getPuntos() + "");

        this.setSpacing(5);
        this.setStyle("-fx-alignment: center; -fx-padding: 10; -fx-border-color: #ba1a1a; -fx-border-width: 1; " +
                "-fx-background-color: #142259;");

        nombreLabel.setFont(pressStartChica);
        nombreLabel.setStyle("-fx-text-fill: #ffc100");
        puntosLabel.setFont(pressStartChica);
        puntosLabel.setStyle("-fx-text-fill: #ffc100");

        this.getChildren().addAll(nombreLabel, puntosLabel);
    }

    public void updatePuntos(int puntos){
        puntosLabel.setText(puntos+"");
    }


    public Jugador getJugador(){
        return jugador;
    }

    public void addPuntos(int puntos){
        int suma = jugador.getPuntos() + puntos;
        jugador.setPuntos(suma);
        puntosLabel.setText(suma + "");
    }

}
