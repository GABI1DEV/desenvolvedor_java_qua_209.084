package com.polimorfismo.models;

final public class PessoaJuridica extends Pessoa {

    //ATRIBUTOS
    public String nomeFantasia;
    public String cnpj;

    //CONSTRUTOR
    public PessoaJuridica(String email, String telefone, String nomeFantasia, String cnpj) {
        super(email, telefone);
        
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;

    }

    public void exibirDados() {
        System.out.println("Nome da empresa: " + this.nomeFantasia);
        System.out.println("CNPJ da empresa: " + this.cnpj);

        super.exibirDados();
    }

}
