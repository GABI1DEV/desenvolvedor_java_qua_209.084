package com.atividade06.models;

final public class Caminhao extends Veiculo {

    //ATRIBUTO

    private int carroceria;

    //CONTRUCTOR

    public Caminhao(String fabricante, String modelo, String ano, String placa, String cor, String categoria, int carroceria) {
        super(fabricante, modelo, ano, placa, cor, categoria);
        this.carroceria =carroceria;
    
    }
    
    //GETTERS E SETTERS


    public int getCarroceria() {
        return this.carroceria;
    }

    public void setCarroceria(int carroceria) {
        this.carroceria = carroceria;
    }

}
