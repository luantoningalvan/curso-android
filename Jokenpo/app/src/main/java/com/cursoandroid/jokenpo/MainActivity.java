package com.cursoandroid.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View v){
        this.opcaoSelecionada("pedra");
    }

    public void selecionadoPapel(View v){
        this.opcaoSelecionada("papel");
    }

    public void selecionadoTesoura(View v){
        this.opcaoSelecionada("tesoura");
    }

    public void opcaoSelecionada(String opcaoSelecionada){

        int escolhaGerada = new Random().nextInt(3);
        String[] opcoes = { "pedra", "papel", "tesoura"};
        String opcaoApp = opcoes[ escolhaGerada ];

        ImageView imagemResultado = findViewById(R.id.imagemResultado);
        TextView textoResultado = findViewById(R.id.textoResultado);

        switch (opcaoApp){
            case "pedra":
                imagemResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imagemResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imagemResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        if(
           opcaoApp == "pedra" && opcaoSelecionada == "tesoura" ||
           opcaoApp == "tesoura" && opcaoSelecionada == "papel" ||
           opcaoApp == "papel" && opcaoSelecionada == "pedra"
        ){
            textoResultado.setText("Você perdeu!");
        } else if (
           opcaoApp == "pedra" && opcaoSelecionada == "papel" ||
           opcaoApp == "tesoura" && opcaoSelecionada == "pedra" ||
           opcaoApp == "papel" && opcaoSelecionada == "tesoura"
        ) {
            textoResultado.setText("Você ganhou!");
        } else {
            textoResultado.setText("Empatou!");
        }

        System.out.println(opcaoApp);

    }
}