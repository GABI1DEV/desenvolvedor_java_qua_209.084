package com.banco.models;

public class ContaPF extends Conta {

    //ATRIBUTOS
   

    //CONSTRUTOR


    //GETTERS E SETTERS






    public void exibirDados() {
        System.out.println("Nome do titular: " + this.pf.getNome());
        System.out.println("CPF do titular: " + this.pf.getCpf());
        System.out.println("E-mail do titular: " + this.pf.getEmail());
        super.exibirDados();
      
    }

}
