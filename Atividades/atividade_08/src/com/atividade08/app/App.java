package com.atividade08.app;

import javax.swing.JOptionPane;

import com.atividade08.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        // INSTACIA DO USUARIO
        
        Pessoa pessoa = new Pessoa(null, 0);

        //ENTRADA DE DADOS

        pessoa.setNome(JOptionPane.showInputDialog("Informe o nome: "));
        pessoa.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: ")));

        //SAIDA DE DADOS

        JOptionPane.showMessageDialog(null, pessoa.getNome() + Usuario.verificarIdade());
        


        
    }
}
