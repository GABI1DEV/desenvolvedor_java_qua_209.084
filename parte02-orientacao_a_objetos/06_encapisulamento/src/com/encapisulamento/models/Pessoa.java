package com.encapisulamento.models;

public class Pessoa {

    private String email;
    private String telefone;

    //CONSTRUTOR


    public Pessoa(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }

    //METODO DE ACESSO (GETTERS E SETTERS)

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return this.telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}
