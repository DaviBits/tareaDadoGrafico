package com.example.demo;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class CentroTablero extends VBox {

    private Juego3Dados juego3dados;
    private DadoUI dadoUI1;
    private DadoUI dadoUI2;
    private DadoUI dadoUI3;
    private Button lanzar = new Button("Lanzar");
    private ControladorJuego3D controlador;

    public CentroTablero(ControladorJuego3D controlador) {
        HBox dados= new HBox();
        HBox boton= new HBox();
        this.controlador = controlador;

        //this.juego3dados = juego3dados;
        dadoUI1 = new DadoUI();
        dadoUI2 = new DadoUI();
        dadoUI3 = new DadoUI();
        lanzar.setOnMouseClicked(e -> controlador.jugar());

        /*
        lanzar.setOnMouseClicked(MouseEvent -> {
            juego3dados.lanzar3Dados();
            dadoUI1.cambiarEmojis(juego3dados.getValorDado1());
            dadoUI2.cambiarEmojis(juego3dados.getValorDado2());
            dadoUI3.cambiarEmojis(juego3dados.getValorDado3());

        });

         */
        dados.getChildren().addAll(dadoUI1, dadoUI2, dadoUI3);
        dados.setAlignment(Pos.CENTER);
        boton.getChildren().addAll(lanzar);
        boton.setAlignment(Pos.CENTER);
        this.getChildren().addAll(dados, boton);

        //this.getChildren().addAll(dadoUI1, dadoUI2, dadoUI3,lanzar);
    }
    public void setOnLanzar(Runnable action) {
        lanzar.setOnAction(e -> action.run());
    }

    public void actualizarDados(int valDado1, int valDado2, int valDado3){
        dadoUI1.cambiarEmojis(valDado1);
        dadoUI2.cambiarEmojis(valDado2);
        dadoUI3.cambiarEmojis(valDado3);
    }
}
