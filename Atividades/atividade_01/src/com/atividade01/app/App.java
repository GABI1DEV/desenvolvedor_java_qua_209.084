package com.atividade01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //VARIAVEIS

        String nome;
        double peso;
        double altura;
        double imc;

        //INSTACIA A CLASSE ESCANNER

        Scanner sc = new Scanner(System.in);

        //ENTRADA DE DADOS

        System.out.println("Informe seu nome: ");
        nome = sc.nextLine();
        System.out.println("Informe seu pesoem kg: ");
        peso = sc.nextDouble();
        System.out.println("Informe sua altura: ");
        altura = sc.nextDouble();
        imc = peso/(altura*altura);
        System.out.println(imc);


        //CALCULAR IMC DO USUARIO
        
        if (imc >= 18.5 && imc <=25)
        
        
            


        //SAIDA DE DADOS

        

        //FECHA OBJETO SCANNER
        sc.close();

    }
}
