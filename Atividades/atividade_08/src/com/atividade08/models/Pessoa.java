package com.atividade08.models;

import com.atividade08.repository.Usuario;
public class Pessoa implements Usuario {
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

    @Override
    public String verificarIdade() {
        return (this.idade >= 18) ? "e maior de idade" : "e menor de idade";
    }

}
