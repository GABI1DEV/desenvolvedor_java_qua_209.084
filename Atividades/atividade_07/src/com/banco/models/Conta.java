package com.banco.models;

import com.banco.repository.IConta;

public abstract class Conta implements IConta {
    //ATRIBUTOS

    private String nAgencia;
    private String nconta;
    private Double saldo;
    
    //CONTRUTOR

    public Conta(String nAgencia, String nconta, Double saldo) {
        this.nAgencia = nAgencia;
        this.nconta = nconta;
        this.saldo = saldo;
    }

    //GETTERS E SETTERS

    public String getNAgencia() {
        return this.nAgencia;
    }

    public void setNAgencia(String nAgencia) {
        this.nAgencia = nAgencia;
    }

    public String getNconta() {
        return this.nconta;
    }

    public void setNconta(String nconta) {
        this.nconta = nconta;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    //METODOS

    @Override
    public void exibirDados() {
        System.out.println("Numero da agencia: " + this.nAgencia);
        System.out.println("Numero da conta: " + this.nconta);
        System.out.println("Saldo: R$ " + this.saldo);
        System.out.println("");
        System.out.println("");
        
    }

    @Override
    public double fazerDeposito(double valor) {
        return this.saldo += valor;
    }

    @Override
    public double fazerSaque(double valor) {
        return this.saldo -= valor;
    }


   

}
