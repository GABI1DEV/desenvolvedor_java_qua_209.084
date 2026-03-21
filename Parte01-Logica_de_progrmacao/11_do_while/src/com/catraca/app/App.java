package com.catraca.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);

        String nome;
        double peso;
        double altura;
        int opcao;

        // LAÇO DE REPETIÇAO

         do{

            System.out.println("deseja registrar nova entrada?");
            System.out.println("1 - registrar nova entrada");
            System.out.println("2 - sair do programa");
            opcao = sc.nextInt();

            if (opcao == 1) {

                sc.nextLine();
                System.out.println("informe o nome");
                nome = sc.nextLine();

                System.out.println("informe seu peso em kg: ");
                peso = sc.nextDouble();
                
                System.out.println("informe a altura em metros:");
                altura = sc.nextDouble();

                if (peso <120 && altura >= 1.25){
                    System.out.println("Entrada de " + nome + " autorizada");

                }
                else{
                    System.out.println("Entrada de " + nome + "nao autorizada");
                }


            }
            else if (opcao == 2 ) {
                System.out.println("obrigado pela preferencia");
            }
            else{
                 System.out.println("opcao invalida");
            }

         } while(opcao != 2);



        sc.close();

    }
}
