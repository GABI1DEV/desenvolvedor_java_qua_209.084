package com.banco.models;

public class ContaPJ extends Conta {
    
    //ATRIBUTOS
     private PessoaJuridica pj;

     public ContaPJ(String nAgencia, String nConta, double saldo, PessoaJuridica pj) {
        super(nAgencia, nConta, saldo);
        this.pj = pj;
     }
    //CONSTRUTOR

    public ContaPJ(PessoaJuridica pj) {
        this.pj = pj;
    }

    //GETTERS E SETTERS

    public void exibirDados(){
        System.out.println("Razao social: " + this.pj.getRazaoSocial());
        System.out.println("NOme fantasia: " + this.pj.getNomeFantasia());
        System.out.println("CNPJ:" + this.pj.getCnpj());
        System.out.println("E-mail: " + this.pj.getEmail());
        super.exibirDados();
    }

    public double fazerSaque(double valor) {
        double novoSaldo = this.getSaldo()-valor-(this.getSaldo()-0.01/100)
        return this.getSaldo();
    }

}
