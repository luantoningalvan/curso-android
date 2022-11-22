package com.cursoandroid.componentesbsicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;

    private CheckBox checkVerde, checkVermelho,  checkBranco;

    private RadioButton sexoMasculino, sexoFeminino;
    private RadioGroup opcaoSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome       = findViewById(R.id.editNome);
        campoEmail      = findViewById(R.id.editEmail);
        textoResultado  = findViewById(R.id.textResultado);

        checkVerde      = findViewById(R.id.checkVerde);
        checkBranco     = findViewById(R.id.checkBranco);
        checkVermelho   = findViewById(R.id.checkVermelho);

        sexoMasculino = findViewById(R.id.radioM);
        sexoFeminino = findViewById(R.id.radioF);

        opcaoSexo = findViewById(R.id.opcaoSexo);

        radio();
    }

    public void checkbox(){
        String texto = "";

        if(checkVerde.isChecked()){
            texto += "Verde Selecionado - ";
        }

        if(checkBranco.isChecked()){
            texto += "Branco Selecionado - ";
        }

        if(checkVermelho.isChecked()){
            texto += "Vermelho Selecionado - ";
        }

        textoResultado.setText(texto);
    }

    public void radio(){
        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if(checkedId == R.id.radioM){
                    textoResultado.setText("Masculino");
                } else if(checkedId == R.id.radioF){
                    textoResultado.setText("Feminino");
                }
            }
        });
    /*
        if (sexoMasculino.isChecked()){
            textoResultado.setText("Masculino");
        } else if(sexoFeminino.isChecked()){
            textoResultado.setText("Feminino");
        } else {
            textoResultado.setText("Nenhum selecionado");
        }
    */
    }

    public void enviar (View view) {
        // checkbox();
        radio();
        /*String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();

        textoResultado.setText("Nome: " + nome + " E-mail: " + email);*/
    }

    public void limpar(View view){
        campoNome.setText("");
        campoEmail.setText("");
    }
}