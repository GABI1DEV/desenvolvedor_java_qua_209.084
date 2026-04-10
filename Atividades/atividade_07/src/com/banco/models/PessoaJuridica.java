package com.banco.models;

public class PessoaJuridica extends Pessoa {
    //ATRIBUTOS
    private String razaoSocial;
    private String nomeFantasia;

    //CONSTRUTOR
    public PessoaJuridica(String razaoSocial, String nomeFantasia, String cnpj, String email) {
        super(email);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
    }

    //GETTERS E SETTERS
    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }


}
