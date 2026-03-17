package com.nota.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //DECLARACAO DE VARIAVEIS

        String nome;
        double nota;

        //INSTACIA A CLASSE SCANNER
        Scanner sc = new Scanner(System.in);

        //ENTRADA DE DADOS

        System.out.println("informe o nome do aluno");
        nome = sc.nextLine();
        System.out.println("Infome a nota etre 0 e 10");
        nota = sc.nextDouble();

        //VERIFICAR SE NOTA E VALIDA

         if (nota >= 0  && nota <= 10){

            if (nota >= 7){
                System.out.println("Esta aprovado");
            }
            else if(nota >= 5) {
                System.out.println(nome + " está de recuperação");
            }
            else {
                System.out.println(nome + " está reprovado");
            }
         }
         else{
            System.out.println(" Nota invalida");
         }

        //FeCHA OBJETO SCANNER
        sc.close();
        
    }
}
