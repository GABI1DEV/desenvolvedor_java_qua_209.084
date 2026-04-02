package com.encapisulamento.models;

final public class PessoaJuridica extends Pessoa{

    //ATRIBUTOS
    private String nomeFantasia;
    private String cnpj;

    public PessoaJuridica(String nomefantasia, String cnpj, String email, String telefone) {
        super(email,telefone);
        this.nomeFantasia = nomefantasia;
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomefantasia) {
        this.nomeFantasia = nomefantasia;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
