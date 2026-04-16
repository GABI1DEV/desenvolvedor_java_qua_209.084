package com.lista.app;

import javax.swing.JOptionPane;

import com.lista.models.Calculadora;

public class App {
    public static void main(String[] args) throws Exception {
       Calculadora calc = new Calculadora(0, 0);

       //DECLARAÇAO DE ARRAYS
       String[] opcoes = {"Soma", "Subtração", "Mutiplicação", "Divisão", "Sair" };
       Object opcao;
       String opcaoSelecionada;

       do {
            opcao =JOptionPane.showInputDialog(
                null, 
                "Selecione uma opção: ",
                "Opções",
                JOptionPane.QUESTION_MESSAGE,
                null, 
                opcoes, 
                opcoes[0]
            );

            if (!opcao.equals("Sair")){
                calc.setX(Double.parseDouble(JOptionPane.showInputDialog("INforme um numero: ")));
                calc.setY(Double.parseDouble(JOptionPane.showInputDialog("Informe outro numero: ")));

                switch (opcaoSelecionada) {
                    case "Soma":
                        JOptionPane.showMessageDialog(null, "Soma: " + calc.somar());
                        break;
                switch (opcaoSelecionada) {
                    case "Subtração":
                        JOptionPane.showMessageDialog(null, "Subtração: " + calc.subtrair());
                        break;
                switch (opcaoSelecionada) {
                    case "Mutiplicação":
                        JOptionPane.showMessageDialog(null, "Mutiplicação: " + calc.mutiplicar());
                        break;
                switch (opcaoSelecionada) {
                    case "Divisão":
                        JOptionPane.showMessageDialog(null, "Divisão: " + calc.dividir());
                        break;
                
                }
            }

            else {
                JOptionPane.showMessageDialog(null, "Programa encerrado");
            }

       } while (opcao != "Sair");

    }
}

