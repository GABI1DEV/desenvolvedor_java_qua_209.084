package com.atividade05.app;

import java.util.Scanner;

import com.atividade05.models.*;

public class App {
    public static void main(String[] args) throws Exception {

       Scanner sc = new Scanner(System.in); 
       Aluno aluno = new Aluno();
       Professor prof = new Professor();
        double b = 0;
       double h = 0;
       double r = 0;
       double a = 0;
       String opcao;

        prof.nome = "Alex machado";
        prof.matricula = "25798491";

        System.out.println("Nome do professor: " + prof.nome);
        System.out.println("matricula do professor: " + prof.matricula);


       System.out.println("Informe o nome do aluno: ");
       aluno.nome = sc.nextLine();
       System.out.println("Informe o email: ");
       aluno.email = sc.nextLine();
       System.out.println("Informe a idade: ");
       aluno.idade = sc.nextInt();

       System.out.println("Nome do aluno: " + aluno.nome);
       System.out.println("E-mail do aluno: " + aluno.email);
       System.out.println("Idade aluno: " + aluno.idade + "anos.");

       System.out.println("1 - calcular area do triangulo");
       System.out.println("2 - calcular area do circulo");
       System.out.println("3 - calcular equacao do 1 grau");
       sc.nextLine();

       opcao = sc.nextLine();


       switch (opcao) {
        case "1":
            System.out.println("informe o valor da base: ");
            b = sc.nextDouble();
            System.out.println("informe o valor da altura: ");
            h = sc.nextDouble();

            System.out.println("A area do triangulo é : " + prof.areaDoTriangulo(b,h));

            break;
        case"2":
            System.out.println("Informe o valor do raio: ");
            r = sc.nextDouble();    
            System.out.println("A area do circulo é  " + prof.areaCirculo(r)); 

            break;
        case"3":
            System.out.println("Informe o valor de a: "); 
            a = sc.nextDouble();
            System.out.println("Informe o valor de b: "); 
            b = sc.nextDouble();
            System.out.println((a != 0) ? "A raiz da equacao do 1 grau é " + prof.equacao1ograu(a, b) : "coeficiente a nao pode ser 0. ");
            break;
        default:
            System.out.println("opercao invaslida.");
            
       }

       sc.close();

    }
}
