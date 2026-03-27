package com.atividade05.models;

public class Professor {

//ATRIBUTOS

    public String nome;
    public String matricula;

//METODOS

    public String darBoasVndas() {
        return "Olá me chamo " + this.nome + " minha matricula e " + this.matricula + ".";

    }

    public double areaDoTriangulo(double b, double h) {
        return (b*h)/2;

    }
    
    


}
