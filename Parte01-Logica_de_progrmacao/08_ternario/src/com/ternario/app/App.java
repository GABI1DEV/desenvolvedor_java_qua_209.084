package com.ternario.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //DECLARAÇAO DE VARIAVEIS

        String nome;
        String result;
        int idade;

        //INSTANCIA A CLASSE  SCANNER
        Scanner sc = new Scanner(System.in);

        //ENTRADA DE DADOS

        System.out.println("informe seu nome :");
        nome = sc.nextLine();
        System.out.println("informe sua idade :");
        idade = sc.nextInt();

        //VERIFICAR IDADE DO USUARIO

        result = (idade >= 18) ? " e maior de idade." : " e menor de idade.";

        //SAIDA DE DADOS

        System.out.println(nome + result);

        //FECHA OBJETO SCANNER 
        sc.close();
    }
}
