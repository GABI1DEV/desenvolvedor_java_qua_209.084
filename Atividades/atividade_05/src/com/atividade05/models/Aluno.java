package com.atividade05.models;

public class Aluno {

//ATRIBUTOS
    public String nome;
    public String email;
    public int idade;

    public String apresentar() {
        return "Eu sou" + this.nome + ".";
    }

}
