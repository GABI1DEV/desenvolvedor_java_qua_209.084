package com.polimorfismo.models;

final public class PesssoaFisica extends Pessoa {

    //ATRIBUTOS
    public String nome;
    public String cpf;
    public int idade;


    //CONSTRUTOR
    public PesssoaFisica(String nome, String cpf, int idade, String email, String telefone) {
        super(email, telefone);

        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    
    } 

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Idade: " + this.idade);

        super.exibirDados();
    }
}
