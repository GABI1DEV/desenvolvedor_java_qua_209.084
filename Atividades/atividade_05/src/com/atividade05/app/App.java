package com.atividade05.app;

import java.util.Scanner;

import com.atividade05.models.*;

public class App {
    public static void main(String[] args) throws Exception {

       Scanner sc = new Scanner(System.in); 
       Aluno aluno = new Aluno();
       Professor prof = new Professor();

       double b;
       double h;
     
  
       System.out.println("Informe o nome do aluno: ");
       aluno.nome = sc.nextLine();

       System.out.println(aluno.apresentar());

        prof.nome = "Alex machado";
        prof.matricula = "25798491";

       System.out.println(prof.darBoasVndas());

       System.out.println("informe o valor da base: ");
       b = sc.nextDouble();
       System.out.println("informe o valor da altura: ");
       h = sc.nextDouble();

       System.out.println("A area do triangulo é : " + prof.areaDoTriangulo(b,h));

       


        
       sc.close();

    }
}
