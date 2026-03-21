package com.atividade02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;   
        int idadeMin = 0;  
        String sala; 
        String filme = null;  

        System.out.println("Informe seu nome: ");
        nome = sc.nextLine();

        System.out.println("Informe sua idade: ");
        idade = sc.nextInt();

        // LIMPEZA DE BUFFER

        sc.nextLine();

        do {
            //LISTA DE FILMES
            System.out.println("Escolha seu filme:");
            System.out.println("Sala - 1 - A RODA QUADRADA - LIVRE");
            System.out.println("Sala - 2 - A VOLTA DOS QUE NAO FORAM - 12 ANOS");
            System.out.println("Sala - 3 - POEIRA EM ALTO MAR - 14 ANOS");
            System.out.println("Sala - 4 - AS TRANÇAS DO REI CARECA - 16 ANOS");
            System.out.println("Sala - 5 - A VINGANÇA DO PEIXE FRITO - 18 ANOS");
            sala = sc.nextLine();
            
            switch (sala) {
                case "1":
                    filme = "A RODA QUADRADA";
                    break;
                case "2":
                    filme = "A VOLTA DOS QUE NAO FORAM";
                    idadeMin = 12;
                    break;   
                case "3":
                    filme = "POEIRA EM ALTO MAR";
                    idadeMin = 14;
                    break;   
                case "4":
                    filme = "AS TRANÇAS DO REI CARECA";
                    idadeMin = 16;
                    break;
                case "5":
                    filme = "A VINGANÇA DO PEIXE FRITO";
                    idadeMin = 18;
                    break;
                default:
                    
                idadeMin = idade + 1;
              
            }

            if (idade >= idadeMin){
                System.out.println("Ingresso comprado por " + nome + ".");
                System.out.println("Filme " + filme + ".");
            }
            else{
                System.out.println("Entrada nao liberada pra usuario " + nome + ".");
                System.out.println("Favor escolher outro filme");
            }

        } while(idade <= idadeMin);

        sc.close();
    }
}