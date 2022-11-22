package com.cursoandroid.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText inputPrecoAlcool, inputPrecoGasolina;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputPrecoAlcool = findViewById(R.id.editPrecoAlcool);
        inputPrecoGasolina = findViewById(R.id.editPrecoGasolina);
        textoResultado = findViewById(R.id.textoResultado);
    }

    public void calcular(View view){
        String precoAlcool = inputPrecoAlcool.getText().toString();
        String precoGasolina = inputPrecoGasolina.getText().toString();

        Boolean resultadoValidacao = validarCampos(precoAlcool, precoGasolina);

        if(resultadoValidacao){
            Double valorAlcool = Double.parseDouble(precoAlcool);
            Double valorGasolina = Double.parseDouble(precoGasolina);

            if((valorAlcool / valorGasolina) >= 0.7){
                textoResultado.setText("Melhor usar gasolina");
            } else {
                textoResultado.setText("Melhor usar álcool");
            }

        } else {
            textoResultado.setText("Preencha todos os campos!");
        }
    }

    public Boolean validarCampos(String pAlcool, String pGasolina){
        Boolean camposValidades = true;

        if(pAlcool == null || pAlcool.equals("")){
            camposValidades = false;
        }

        if(pGasolina == null || pAlcool.equals("")){
            camposValidades = false;
        }

        return camposValidades;
    }
}