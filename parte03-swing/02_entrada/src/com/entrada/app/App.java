package com.entrada.app;

import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        
        //DECLARACAO DE VARIAVEIS
        String nome;

        //ENTRADA DE DADOS
        nome = JOptionPane.showInputDialog("Informe seu nome: ");

        //SAIDA DE DADOS
        JOptionPane.showMessageDialog(null, "Meu nome é: " + nome);
    }
}
