package com.composicao.app;

import java.util.Scanner;

import com.composicao.models.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        Pessoa motorista = new Pessoa(null, null, null, null, null);
        Veiculo carro = new Veiculo(null, null, null, null, null, null, motorista);

        // ENTRADA DE DADOS DO MOTORISTA

        System.out.println("Informe o nome do motorista: ");
        motorista.setNome(sc.nextLine());
        System.out.println("Informe o CF do motoristsa; ");
        motorista.setCpf(sc.nextLine());
        System.out.println("Informe o telfone do motorista: ");
        motorista.setTelefone(sc.nextLine());
        System.out.println("INfome o e-mail do motorista: ");
        motorista.setEmail(sc.nextLine());
        System.out.println("Informe a CNH do motorista :");
        motorista.setCnh(sc.nextLine());

        //ENTRADA DE DADOS CARRO

        System.out.println("Informe o fabricante do carro: ");
        carro.setFabricante(sc.nextLine());
        System.out.println("informe o modelo do carro: ");
        carro.setModelo(sc.nextLine());
        System.out.println("Informe a cor do carro: ");
        carro.setCor(sc.nextLine());
        System.out.println("Informe o ano do carro: ");
        carro.setAno(sc.nextLine());
        System.out.println("Informe a placa do carro: ");
        carro.setPlaca(sc.nextLine());
        System.out.println("Informe o renavan do carro: ");
        carro.setRenavam(sc.nextLine());
        
        //ASSOCIA O CARRO AO MOTORISTA

        carro.setMotorista(motorista);

        //INFORME OS DADOS

        System.out.println("Fabricante do carrp: " + carro.getFabricante());
        System.out.println("Modelo do carro: " + carro.getModelo());
        System.out.println("Cor do carro: " + carro.getCor());
        System.out.println("Ano do carro: " + carro.getAno());
        System.out.println("Placa do carro: " + carro.getPlaca());
        System.out.println("Renavan do carro: " + carro.getRenavam());
        System.out.println("Nome do motorista: " + carro.getMotorista());
        System.out.println("Nome do motorista do carro: " + carro.getMotorista().getNome());
        System.out.println("CPF do motorista: " + carro.getMotorista().getCpf());
        System.out.println("TElefone do motorista: " + carro.getMotorista().getTelefone());
        System.out.println("Email do motorista: " + carro.getMotorista().getEmail());
        System.out.println("CNH motorista do carro: " + carro.getMotorista().getCnh());
        

        sc.close();
    }
}
