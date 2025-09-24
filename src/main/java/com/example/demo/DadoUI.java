package com.example.demo;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class DadoUI extends Label {

    public final int EMOJI_DADO = 9855;
    public DadoUI() {

        Font font = new Font("Arial", 80);
        String emoji = new String(Character.toChars(EMOJI_DADO + 1));
        setText(emoji);
        setFont(font);
    }

    public void cambiarEmojis(int valor) {
        String emoji = new String(Character.toChars(EMOJI_DADO + valor));
        setText(emoji);
    }
}
