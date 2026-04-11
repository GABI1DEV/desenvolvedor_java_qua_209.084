package com.banco.app;

import java.util.Scanner;

import com.banco.models.PessoaFiscica;

import com.banco.models.PessoaJuridica;

import com.banco.models.ContaPF;

import com.banco.models.ContaPJ;

import com.banco.models.Pessoa;

import com.banco.models.Conta;

public class App {
    public static void main(String[] args) throws Exception {
      //ATRIBUTOS
         PessoaFiscica pf = new PessoaFiscica(null, null, null);
         ContaPF ccpf = new ContaPF("1234-5", "10101-1", 0, pf);
        PessoaJuridica pj = new PessoaJuridica(null, null, null, null);
        ContaPJ ccpj = new ContaPj("1234-5", "20101-1", 0, pj); 
      Scanner sc = new Scanner(System.in);
      String pessoaTipo;
      String opcao = null;
      double valor; 


      System.out.println("Escolha o tipo de pessoa que deseja cadastrar: ");
      System.out.println("PF - PEssoa Fisica");
      System.out.println("Pj - Pessoa Juridica");

      pessoaTipo= sc.nextLine();

        switch (pessoaTipo) {
            case "PF":
             
               System.out.println("Informe o nome do usuario: ");
               pf.setNome(sc.nextLine()); 
               System.out.println("Informe o CPF do titular:");
               pf.setCpf(sc.nextLine());
                System.out.println("Informe o email do titular:");
                pf.setEmail(sc.nextLine());
            case "PJ":
               
                System.out.println("Informe a razao social: ");
                pj.setRazaoSocial(sc.nextLine());
                System.out.println("Informe o nome fantasia da empresa: ");
                pj.setNomeFantasia(sc.nextLine());
                System.out.println("Informe o CNPJ da empresa");
                pj.setCnpj(sc.nextLine());
                System.out.println("Informe o E-mail da empresa: ");
                pj.setEmail(sc.nextLine());
                
                ccpj.setpj(pj);

                break;
        
            default:
            System.out.println("PESSOA 404");

            if ("PF".equals(pessoaTipo) ||"PJ".equals(pessoaTipo)){
            do {
                System.out.println(" ------Opção Roubank------");
                System.out.println("1 - Consultar dados da conta");
                System.out.println("2 - Fazer deposito");
                System.out.println("3 - Fazer saque");
                System.out.println("4 - Sair do programa");
                System.out.println("");
                opcao = sc.nextLine();
            
                switch (opcao) {
                    case "1":
                       if("PF".equals(pessoaTipo));{
                       ccpf.exibirDados();    
                }
            }
                else {
                    ccpj.exibirDados();

                }
                break;
            } while (!"4".equals(opcao));
        }
        else{
            System.out.println("Não foi possivel cadastrar novo titular");
            System.out.println("Programa encerrado");
        }
        }
     
    }
 }

