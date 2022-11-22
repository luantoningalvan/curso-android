package com.cursoandroid.calculadoragorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText inputValor;
    private SeekBar inputPorcentagem;
    private TextView valorPorcentagem;
    private TextView resultadoValorGorjeta;
    private TextView resultadoValorFinal;

    private double porcentagem = 0;

    private static final DecimalFormat df = new DecimalFormat("0.00");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputValor = findViewById(R.id.inputValor);
        inputPorcentagem = findViewById(R.id.inputPorcentagem);
        valorPorcentagem = findViewById(R.id.valorPorcentagem);
        resultadoValorGorjeta = findViewById(R.id.resultadoValorGorjeta);
        resultadoValorFinal = findViewById(R.id.resultadoValorFinal);

        inputPorcentagem.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                porcentagem = i;
                valorPorcentagem.setText(Math.round(porcentagem) + "%");
                calcularPorcentagem();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });
    }

    private void calcularPorcentagem(){
        String valorRecuperado = inputValor.getText().toString();

        if(valorRecuperado != null && !valorRecuperado.equals("")){
            double inputValorNumerico = Double.parseDouble(inputValor.getText().toString());
            double valorGorjeta = inputValorNumerico * porcentagem / 100;

            resultadoValorGorjeta.setText("R$ " + df.format(valorGorjeta));
            resultadoValorFinal.setText("R$ " + df.format(valorGorjeta + inputValorNumerico));
        } else {
            Toast.makeText(getApplicationContext(),"Preencha um valor", Toast.LENGTH_LONG).show();
        }
    }
}