package com.banco.models;

public class PessoaFiscica extends Pessoa {
    //ATRIBUTOS

    private String nome;
    private String cpf;

    //CONSTRUTOR

    public PessoaFiscica(String nome, String cpf, String email) {
        super(email);
        this.nome = nome;
        this.cpf = cpf;
    }

    //GETTERS E SETTERS

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }





}
