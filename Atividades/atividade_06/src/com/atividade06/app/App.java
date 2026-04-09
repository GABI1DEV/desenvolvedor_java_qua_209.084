package com.atividade06.app;

import java.util.Scanner;

import com.atividade06.models.Moto;
import com.atividade06.models.Carro;
import com.atividade06.models.Caminhao;
import com.atividade06.models.Onibus;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String tipoVeiculo;

        System.out.println("Infome qual o tipo de veiculo quedeseja cadastra");
        System.out.println("A - Moto");
        System.out.println("B - carro");
        System.out.println("C - Caminhão");
        System.out.println("D - Onibus");

        tipoVeiculo =sc.nextLine();
        switch (tipoVeiculo) {
            case "A":
                Moto moto = new Moto(null, null, null, null, null, "A", null);
                //TODO - dados do veiculo
                break;
                //TODO: fazer os cases dos outros
                

        }


        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        sc.close();
    }
}
