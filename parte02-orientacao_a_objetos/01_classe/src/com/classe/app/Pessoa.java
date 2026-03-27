package com.classe.app;

public class Pessoa {

//ATRIBUTOS
    
    public String nome;
    public String email;
    public int idade;
    public double altura;

//METODO

    public void cumprimentar() {
        System.out.println("Ola, boa noite");
    }
    public void apresentar(){
        System.out.println("Meu nome é " + this.nome + ", meu e-mail é " + this.email + ", tenho " + this.idade + " anos, e " + this.altura + " metros de altura.");
    }

}
