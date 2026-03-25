package com.classe.app;

 import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    // INSTACIA AS CLASSES 
        Pessoa pessoa = new Pessoa();
        Scanner sc = new Scanner(System.in);

    //ENTRADA DE DADOS

        System.out.println("Informe o nome da pessoa: ");
        pessoa.nome = sc.nextLine();
        System.out.println("Informe a idade da pessoa: ");
        pessoa.idade = sc.nextInt();
        System.out.println("Informe a altura da pessoa em metros: ");
        pessoa.altura = sc.nextDouble();
       
        sc.nextLine();

        System.out.println("Informe o e-mail da pessoa: ");
        pessoa.email = sc.nextLine();

    //SAIDA DE DADOS
       pessoa.cumprimentar();
       pessoa.apresentar();

        sc.close();
    
    }
}
 //System.out.println("Atributos do objeto:");
        //System.out.println("Nome:" + pessoa.nome);
        //System.out.println("Email:" + pessoa.email);
        //System.out.println("Idade:" + pessoa.idade);
        //System.out.println("Altura:" + pessoa.altura + " metros");