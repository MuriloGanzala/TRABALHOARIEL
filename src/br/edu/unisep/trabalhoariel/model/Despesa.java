package br.edu.unisep.trabalhoariel.model;

import java.util.Date;

public class Despesa {
    private String descricao;
    private double valor;
    private Date data;
    private Pessoa pessoa;

    //  Constructor
    public Despesa(String descricao, double valor, Date data, Pessoa pessoa) {
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.pessoa = pessoa;
    }

    // Getters e Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
