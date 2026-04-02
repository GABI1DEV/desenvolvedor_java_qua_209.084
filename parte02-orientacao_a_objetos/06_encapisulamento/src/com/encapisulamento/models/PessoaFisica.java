package com.encapisulamento.models;

final public class PessoaFisica extends Pessoa{

    //ATRIBUTOS
    private String nome;
    private String cpf;

    //CONSTRUCTOR

    public PessoaFisica(String nome, String cpf, String email, String telefone) {
        super(email,telefone);
        this.nome = nome;
        this.cpf = cpf;
    }

     //METODO DE ACESSO (GETTERS E SETTERS)
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String GetCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
 