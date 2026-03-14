package com.input.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // DECLARAÇAO DE VARIAVEIS
        String nome;
        String email;
        int idade;
        Double altura;

        // CRIAR OBJETO QUE RECEBE OS DADOS DO USUARIO
        Scanner sc = new Scanner(System.in);

        // ENTADA DE DADOS
        System.out.println("INFORME SEU NOME:  ");
        nome = sc.nextLine();
        System.out.println("Informe a sua idade: ");
        idade = sc.nextInt();
        System.out.println("Informe sua altura em metros: ");
        altura= sc.nextDouble();

        // LIMPEZA DE BUFFER
        sc.nextLine();
        System.out.println("informe seu email: ");
        email = sc.nextLine();

   


        // SAIDA DE DADOS
        System.out.println("nome:" + nome);
        System.out.println("idade:" + idade );
        System.out.println("altura:" + altura +"metros");
        System.out.println("email:" + email);

        // FECHA OBJETOgabriela

        sc.close();

        
    }
}

