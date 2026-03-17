package com.maioridade.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // DECLARAÇAO DE VARIAVEIS

        String nome;
        int idade;

        // INSTANCIAS  A CLASSE SCANNER

        Scanner sc = new Scanner(System.in);

        // INPUT

        System.out.println("Informe o seu nome");
        nome = sc.nextLine();
        System.out.println("Informe sua idade: ");
        idade = sc.nextInt();

        //VERIFICA IDADE
        if (idade >= 18){
            System.out.println(nome + "e maior de idade.");

        }
        else{
            System.out.println(nome + " e menor de idade");
        }

        //FECHA OBJETOgb
        
        sc.close();
    }
}
