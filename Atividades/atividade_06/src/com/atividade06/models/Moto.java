package com.atividade06.models;

final public class Moto extends Veiculo {
    
     //ATRIBUTO 

    private String cilindradas;

    //CONTRUCTOR

    public Moto(String fabricante, String modelo, String cor, String ano, String placa,String categoria, String cilindradas) {
        super(fabricante, modelo, cor, ano, placa, categoria);
        this.cilindradas = cilindradas;

    }
   
    //GETTERS E SETTERS

    public String getCilindradas() {
        return this.cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

 

}
