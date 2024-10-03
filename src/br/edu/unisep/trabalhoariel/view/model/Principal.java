package br.edu.unisep.trabalhoariel;

import br.edu.unisep.trabalhoariel.model.Pessoa;
import br.edu.unisep.trabalhoariel.model.Despesa;

import javax.swing.*;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(30,"pedro","12331.1312.131");
        Despesa despesa = new Despesa("compra de celular",1200,new Date(),pessoa);

        String mensagem = "Nome: " + pessoa.getNome() +
                "\nIdade: " + pessoa.getIdade() +
                "\nCPF: " + pessoa.getCpf() +
                "\n\nDespesa:" +
                "\nDescrição: " + despesa.getDescricao() +
                "\nValor: R$ " + despesa.getValor() +
                "\nData: " + despesa.getData();
        JOptionPane.showMessageDialog(null, mensagem);


    }
}
