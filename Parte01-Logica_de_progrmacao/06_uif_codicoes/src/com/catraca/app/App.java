package com.catraca.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String nome;
        double peso;
        double altura;

        //INSTACIA A CLASSE Scanner

        Scanner sc = new Scanner(System.in);

        //ENTRADA DE DADOS

        System.out.println("Informe seu nome");
        nome = sc.nextLine();
        System.out.println("Informe seu peso em kg; ");
        peso = sc.nextDouble();
        System.out.println("Informe sua altura em metros:");
        altura = sc.nextDouble();

        //CONDICIONAL COM OPERADOR BOLEANO
        
        if (peso <= 120 && altura >=1.25){
            System.out.println("entrada de " + nome + " autorizada");
        }
        else{
            System.out.println("entrada de  " + nome + "  nao autorizada");
        }
        //FECHA OBEJETO 

        sc.close();

      
    }
}
