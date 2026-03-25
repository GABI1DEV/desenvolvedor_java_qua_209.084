package com.atividade04.app;

    import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    //INSTACIA A CLASSE
        Carro carro = new Carro();
        Scanner sc = new Scanner(System.in);

    //ENTRADA DE DADOS
        System.out.println("Informe o fabricante do seu carro: ");
        carro.fabricante = sc.nextLine();
        System.out.println("Informe o modelo do seu carro: ");
        carro.modelo = sc.nextLine();
        System.out.println("Iforme a cor do seu carro: ");
        carro.cor = sc.nextLine();
        System.out.println("Informe o ano do seu carro: ");
        carro.ano = sc.nextInt();

        sc.nextLine();
        
        System.out.println("informe a placa do seu carro: ");
        carro.placa = sc.nextLine();


        sc.close();
    }
}




//desenvolva um programa que crie um objeto da classe veiculo
//pode ser qualquer veiculo) com os atributos
//fabricante
//modelo
//placa 
//ano
//cor
//o programa devera mostar os dados do veiculo(ob veiculo nao mostar dados  por tanto nao pode via metodo)
//usuario devera informar os dados