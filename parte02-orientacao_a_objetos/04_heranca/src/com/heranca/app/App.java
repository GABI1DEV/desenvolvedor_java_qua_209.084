package com.heranca.app;

import java.util.Scanner;

import com.heranca.models.PessoaFisica;
import com.heranca.models.PessoaJuridica;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();

        //DADOS DA EMPRESA

        empresa.razaoSocial = "alex SA";
        empresa.nomeFantasia = "kids graça Eventos infantis";
        empresa.cnpj = "51.438.999/0001-96";
        empresa.email = "kidsgraça@contato.com.br";
        empresa.telefone = "(61) 98765-4321";
        empresa.endereço = "campo da esperança";
        empresa.website = "kidsgraca.com.br";


        //DADOS DO USUARIO

        System.out.println("DADOS DO USUARIO: ");
        System.out.println("INforme o nome do usuario: ");
        usuario.nome = sc.nextLine();
        System.out.println("Informe o cpf do usuario: ");
        usuario.cpf = sc.nextLine();
        System.out.println("Informe o email do usuario: ");
        usuario.email = sc.nextLine();
        System.out.println("Informe o telefone do usuario: ");
        usuario.telefone = sc.nextLine();
        System.out.println("Informe o endereço do usuario: ");
        usuario.endereço = sc.nextLine();
        System.out.println("informe a idade do usuario: ");
        usuario.idade = sc.nextInt();

        //SAIDA DE DADOS
        System.out.println(usuario.apresentar());
        System.out.println(empresa.recepcionar(usuario.nome));

        sc.close();
    }


}
