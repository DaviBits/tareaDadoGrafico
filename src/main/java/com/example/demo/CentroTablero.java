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
    private Label nombreGanador;
    private Label labelNumeroRonda;

    public CentroTablero(ControladorJuego3D controlador) {
        Font pressStart = Font.loadFont(
                getClass().getResourceAsStream("/PressStart2P-Regular.ttf"),
                32
        );

        Font pressStartChica = Font.loadFont(
                getClass().getResourceAsStream("/PressStart2P-Regular.ttf"),
                20
        );



        HBox dados= new HBox();
        HBox boton= new HBox();
        //zona superior para el numero de ronda
        VBox zonaSuperior=new VBox(64);
        labelNumeroRonda = new Label();
        labelNumeroRonda.setFont(pressStart);
        labelNumeroRonda.setStyle("-fx-text-fill: #000000; ");
        labelNumeroRonda.setMaxWidth(Double.MAX_VALUE);
        labelNumeroRonda.setAlignment(Pos.CENTER);
        zonaSuperior.getChildren().add(labelNumeroRonda);


        //zona media para los dados
        VBox zonaMedia=new VBox();
        dadoUI1 = new DadoUI();
        dadoUI2 = new DadoUI();
        dadoUI3 = new DadoUI();
        lanzar.setOnMouseClicked(e -> controlador.jugar());//AQUI INICIA EL JUEGO
        dados.getChildren().addAll(dadoUI1, dadoUI2, dadoUI3);
        dados.setAlignment(Pos.CENTER);
        boton.getChildren().addAll(lanzar);
        boton.setAlignment(Pos.CENTER);
        zonaMedia.getChildren().addAll(dados, boton);

        //zona inferior del centro
        VBox zonaInferior = new VBox();
        nombreGanador = new Label();
        nombreGanador.setFont(pressStartChica);
        nombreGanador.setStyle(" -fx-text-fill: #000000;");
        nombreGanador.setMaxWidth(Double.MAX_VALUE);
        nombreGanador.setAlignment(Pos.CENTER);
        zonaInferior.getChildren().addAll(nombreGanador);

        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);
        this.getChildren().addAll(zonaSuperior, zonaMedia, zonaInferior);

        mostrarRonda(1);





        /*
        lanzar.setOnMouseClicked(MouseEvent -> {
            juego3dados.lanzar3Dados();
            dadoUI1.cambiarEmojis(juego3dados.getValorDado1());
            dadoUI2.cambiarEmojis(juego3dados.getValorDado2());
            dadoUI3.cambiarEmojis(juego3dados.getValorDado3());

        });

         */

       // this.getChildren().addAll(dados, boton, zonaSuperior);

        //this.getChildren().addAll(dadoUI1, dadoUI2, dadoUI3,lanzar);
    }

    public void mostrarGanador(String nombre){
        nombreGanador.setText("el ganador es "+nombre+"!!");

    }

    public void mostrarRonda(int ronda){

        labelNumeroRonda.setText("ronda: "+ronda+"!!");
    }

    public void actualizarDados(int valDado1, int valDado2, int valDado3){
        dadoUI1.cambiarEmojis(valDado1);
        dadoUI2.cambiarEmojis(valDado2);
        dadoUI3.cambiarEmojis(valDado3);
    }

    public void eliminarBotonLanzar(){
        lanzar.setVisible(false);
        lanzar.setManaged(false);
    }
}

