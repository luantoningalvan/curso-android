package com.cursoandroid.cardview.model;

public class Post {
    private  String nome;
    private  String postagem;
    private  int imagem;

    public Post(String nome, String postagem, int imagem) {
        this.nome = nome;
        this.postagem = postagem;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPostagem() {
        return postagem;
    }

    public void setPostagem(String postagem) {
        this.postagem = postagem;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
