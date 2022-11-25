package com.cursoandroid.cardview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cursoandroid.cardview.R;
import com.cursoandroid.cardview.model.Post;

import java.util.List;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> {
    private List<Post> postagens;

    public PostagemAdapter(List<Post> p) {
        this.postagens = p;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.postagem_detalhe, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Post postagem = postagens.get(position);
        holder.nomePostagem.setText(postagem.getNome());
        holder.textoPostagem.setText(postagem.getPostagem());
        holder.imagemPostagem.setImageResource(postagem.getImagem());
    }

    @Override
    public int getItemCount() {
        return postagens.size();
    }

    public class  MyViewHolder extends RecyclerView.ViewHolder {
        TextView nomePostagem;
        TextView textoPostagem;
        ImageView imagemPostagem;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nomePostagem = itemView.findViewById(R.id.nomePostagem);
            textoPostagem = itemView.findViewById(R.id.textoPostagem);
            imagemPostagem = itemView.findViewById(R.id.imagemPostagem);
        }
    }
}
