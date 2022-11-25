package com.cursoandroid.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.cursoandroid.cardview.R;
import com.cursoandroid.cardview.adapter.PostagemAdapter;
import com.cursoandroid.cardview.model.Post;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Post> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prepararPostagens();

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);

        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    public void prepararPostagens(){
        Post post = new Post("Luan Galvan", "Por favor não caia", R.drawable.imagem1);
        this.postagens.add(post);

        post = new Post("Zé do caixão", "Eis que liberam a maconha na minha cidade", R.drawable.imagem2);
        this.postagens.add(post);

        post = new Post("Flavinho do Pneu", "Imagem top", R.drawable.imagem3);
        this.postagens.add(post);

        post = new Post("Validrene", "Que lugar lindo pra cair e não ter como chamar resgate", R.drawable.imagem4);
        this.postagens.add(post);
    }
}