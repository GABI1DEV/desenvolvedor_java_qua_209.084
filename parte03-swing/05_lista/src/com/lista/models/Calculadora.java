package com.lista.models;

import com.lista.repository.Icalculadora;

public class Calculadora implements Icalculadora {
    //ATRIBUTOS
    private double x;
    private double y;
     
    //GETTERS E SETTERS
    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //CONSTRUTOR
    @Override
    public double dividir() {
        return this.x/this.y;
    }

    @Override
    public double mutiplicar() {
        return this.x*this.y;
    }

    @Override
    public double somar() {
        return this.x+this.y;
    }

    @Override
    public double subtrair() {
        return this.x-this.y;
    }


}

