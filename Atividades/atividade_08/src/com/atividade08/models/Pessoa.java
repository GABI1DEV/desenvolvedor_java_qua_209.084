package com.atividade08.models;

public class Pessoa {
    //ATRIBUTOS
    String nome;
    int idade;

    //CONSTRUTOR

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //GETTERS E SETTERS


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


}
