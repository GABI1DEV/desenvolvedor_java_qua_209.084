package com.banco.models;

public class ContaPF extends Conta {

    //ATRIBUTOS
      private PessoaFisica pf;

    public ContaPF(String nAgencia, String nConta, double saldo, PessoaFisica pf) {
        super(nAgencia, nConta, saldo);
        this.pf = pf;
    }

    //CONSTRUTOR
     public PessoaFisica getPf() {
        return this.pf;
    }

    public void setPf(PessoaFisica pf) {
        this.pf = pf;
    }


    //GETTERS E SETTERS






    public void exibirDados() {
        System.out.println("Nome do titular: " + this.pf.getNome());
        System.out.println("CPF do titular: " + this.pf.getCpf());
        System.out.println("E-mail do titular: " + this.pf.getEmail());
        super.exibirDados();
      
    }

}
