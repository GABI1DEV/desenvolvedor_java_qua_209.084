package com.encapisulamento.app;
import java.util.Scanner;

import com.encapisulamento.models.PessoaFisica;

import com.encapisulamento.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica(null, null, null, null);
        PessoaJuridica empresa = new PessoaJuridica(null, null, null, null);

        //DADOS DA EMPRESA
        empresa.setNomeFantasia("Funeraria voce e o proximo");
        empresa.setCnpj("09.780.602/0001-83");
        empresa.setEmail("funeraria@comtato.com.br");
        empresa.setTelefone("(61)98765-4321");

        System.out.println("Informe o nome: ");
        usuario.setNome(sc.nextLine());
        System.out.println("Informe o cpf: ");
        usuario.setCpf(sc.nextLine());
        System.out.println("Informe o e-mail: ");
        usuario.setEmail(sc.nextLine());
        System.out.println("INforme o telefone: ");
        usuario.setTelefone(sc.nextLine());

        //SAIDA DE DADOS

        System.out.println("\nDADOS DO USUARIO: \n");
        System.out.println("Nome do usuario: " + usuario.getNome());
        System.out.println("CPF do usuario: " + usuario.GetCpf());
        System.out.println("E-mail do usuario: " + usuario.getEmail());
        System.out.println("Telefone do usuario: " + usuario.getTelefone());
        System.out.println("\nDADOS DA EMPRESA:\n");
        System.out.println("Nome da empresa: " + empresa.getNomeFantasia());
        System.out.println("CNPJ da empresa: " + empresa.getCnpj());
        System.out.println("E-mail da empresa: " + empresa.getEmail());
        System.out.println("Telefone da empresa: " + empresa.getTelefone());
        System.out.println("");
      
        

        sc.close();
    }
}
