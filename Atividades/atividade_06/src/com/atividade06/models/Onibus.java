package com.atividade06.models;

final public class Onibus extends Veiculo {

    //ATRIBUTO

    private boolean leito;


    //CONSTRUCTOR
    
    public Onibus(String fabricante, String modelo, String ano, String placa, String cor, String categoria, boolean leito) {
        super(fabricante, modelo, ano, placa, cor, categoria);
        this.leito = leito;
        
    }
      
    //GETTERS E SETTERS

    public boolean isLeito() {
        return this.leito;
    }

    public boolean getLeito() {
        return this.leito;
    }

    public void setLeito(boolean leito) {
        this.leito = leito;
    }
    
}
