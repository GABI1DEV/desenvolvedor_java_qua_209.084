package com.banco.models;

public abstract class Pessoa {
    //ATRIBUTOS 
    private String email;

    //CONSTRUTOR
    public Pessoa(String email) {
        this.email = email;
    }

    //GETTERS E SETTERS
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
