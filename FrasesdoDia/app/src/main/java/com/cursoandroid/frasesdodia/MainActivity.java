package com.cursoandroid.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase(View view){
        TextView textoResultado = findViewById(R.id.textView);

        String[] frases = {
                "Nunca é tarde para desistir.",
                "A vida te derruba hoje preparando a queda de amanhã.",
                "Calma, tudo passa! Nem que seja por cima de você.",
                "Quando tudo estiver dando errado, se acostume.",
                "É só uma fase ruim, vai piorar.",
        };

        int randomNumber = new Random().nextInt(5);

        textoResultado.setText(frases[randomNumber]);
    }
}