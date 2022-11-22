package com.cursoandroid.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listaLocais;
    private String[] itens = {
            "Fernando de Noronha, Pernambuco", "Praia de Pipa, Rio Grande do Norte", "Caraíva, Bahia",
            "Maragogi, Alagoas", "Ilhabela, São Paulo", "Bombinhas, Santa Catarina", "Bonito, Mato Grosso do Sul",
            "Chapada Diamantina, Bahia", "Chapada dos Veadeiros, Goiás", "Pantanal, Mato Grosso do Sul e Mato Grosso",
            "Amazônia, Amazonas", "Jalapão, Tocantins", "São Paulo, São Paulo", "Rio de Janeiro, Rio de Janeiro",
            "Brasília, Distrito Federal", "Porto Alegre, Rio Grande do Sul"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaLocais = findViewById(R.id.listLocais);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        listaLocais.setAdapter(adaptador);
        listaLocais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String valorSelecionado = listaLocais.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(), valorSelecionado, Toast.LENGTH_SHORT).show();

            }
        });
    }
}