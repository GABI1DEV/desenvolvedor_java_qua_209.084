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
                
                System.out.println("Informe o fabricante:");
                moto.setFabricante(sc.nextLine());
                System.out.println("Informe o modelo:");
                moto.setModelo(sc.nextLine());
                System.out.println("Informe a cor:");
                moto.setCor(sc.nextLine());
                System.out.println("Informe a placa:");
                moto.setPlaca(sc.nextLine());
                System.out.println("Informe o ano:");
                moto.setAno(sc.nextLine());
                System.out.println("Informe as cilindradas:");
                moto.setCilindradas(sc.nextLine());

                System.out.println("Fabricante: " + moto.getFabricante());
                System.out.println("Modelo: " + moto.getModelo());
                System.out.println("Cor: " + moto.getCor());
                System.out.println("Placa: " + moto.getPlaca());
                System.out.println("Ano: " + moto.getAno());
                System.out.println("Cilindradas: " + moto.getCilindradas());
                System.out.println("Categoria: " + moto.getCategoria());

                break;
            case "B":
                Carro carro = new Carro(null, null, null, null, null, "B", true);
                
                System.out.println("Informe o fabricante:");
                carro.setFabricante(sc.nextLine());
                System.out.println("Informe o modelo:");
                carro.setModelo(sc.nextLine());
                System.out.println("Informe a cor:");
                carro.setCor(sc.nextLine());
                System.out.println("Informe a placa:");
                carro.setPlaca(sc.nextLine());
                System.out.println("Informe o ano:");
                carro.setAno(sc.nextLine());
                System.out.println("Tem bagageiro?: (true ou false)");
                carro.setBagageiro(sc.nextBoolean());

                System.out.println("Fabricante: " + carro.getFabricante());
                System.out.println("Modelo: " + carro.getModelo());
                System.out.println("Cor: " + carro.getCor());
                System.out.println("Placa: " + carro.getPlaca());
                System.out.println("Ano: " + carro.getAno());
                System.out.println("Bagageiro: " + carro.getBagageiro());
                System.out.println("Categoria: " + carro.getCategoria());

                break;
            case "C":
                Onibus onibus = new Onibus(null, null, null, null, null, "C", true);
                
                System.out.println("Informe o fabricante:");
                onibus.setFabricante(sc.nextLine());
                System.out.println("Informe o modelo:");
                onibus.setModelo(sc.nextLine());
                System.out.println("Informe a cor:");
                onibus.setCor(sc.nextLine());
                System.out.println("Informe a placa:");
                onibus.setPlaca(sc.nextLine());
                System.out.println("Informe o ano:");
                onibus.setAno(sc.nextLine());
                System.out.println("É leito?: (true ou false)");
                onibus.setLeito(sc.nextBoolean());

                System.out.println("Fabricante: " + onibus.getFabricante());
                System.out.println("Modelo: " + onibus.getModelo());
                System.out.println("Cor: " + onibus.getCor());
                System.out.println("Placa: " + onibus.getPlaca());
                System.out.println("Ano: " + onibus.getAno());
                System.out.println("Leito? " + onibus.getLeito());
                System.out.println("Categoria: " + onibus.getCategoria());

                break;
            case "D":
                Caminhao caminhao = new Caminhao(null, null, null, null, null, "D", 0);
                
                System.out.println("Informe o fabricante:");
                caminhao.setFabricante(sc.nextLine());
                System.out.println("Informe o modelo:");
                caminhao.setModelo(sc.nextLine());
                System.out.println("Informe a cor:");
                caminhao.setCor(sc.nextLine());
                System.out.println("Informe a placa:");
                caminhao.setPlaca(sc.nextLine());
                System.out.println("Informe o ano:");
                caminhao.setAno(sc.nextLine());
                System.out.println("Informe a capacidade da carroceria:");
                caminhao.setCarroceria(sc.nextInt());

                System.out.println("Fabricante: " + caminhao.getFabricante());
                System.out.println("Modelo: " + caminhao.getModelo());
                System.out.println("Cor: " + caminhao.getCor());
                System.out.println("Placa: " + caminhao.getPlaca());
                System.out.println("Ano: " + caminhao.getAno());
                System.out.println("Capacidade da carroceria: " + caminhao.getCarroceria());
                System.out.println("Categoria: " + caminhao.getCategoria());

                break;
            default:
                System.out.println("Categoria inexistente");
        }

        sc.close();
    }
}