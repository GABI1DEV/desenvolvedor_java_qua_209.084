package com.polimorfismo.app;

import java.util.Scanner;

import com.polimorfismo.models.PesssoaFisica;
import com.polimorfismo.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        PesssoaFisica usuario = new PesssoaFisica(null, null, 0, null, null);
        PessoaJuridica empresa = new PessoaJuridica(null, null, null, null);

        empresa.nomeFantasia = "Caféteria Café Tão Gostoso";
        empresa.cnpj = "18.214.969/0001-20";
        empresa.email = "cafetaogostoso@contato.com.br";
        empresa.telefone = "(61) 998765-4321";

        System.out.println("Dados do usuario: ");
        System.out.println("Informe o nome: ");
        usuario.nome = sc.nextLine();
        System.out.println("Informe o CPF: ");
        usuario.cpf = sc.nextLine();
        System.out.println("Informe o email: ");
        usuario.email = sc.nextLine();
        System.out.println("Informe o telefone: ");
        usuario.telefone = sc.nextLine();
        System.out.println("Informe idade: ");
        usuario.idade = sc.nextInt();

        System.out.println("\nDADOS DA EMPRESA\n");
        usuario.exibirDados();
        System.out.println("\nDADOS DA EMPRESA\n");
        empresa.exibirDados();
        sc.close();
        
        
    }
}
