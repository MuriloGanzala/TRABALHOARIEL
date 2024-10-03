package br.edu.unisep.trabalhoariel.model;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
//CONSTRUCTOR
    public Pessoa(int idade, String nome, String cpf) {
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
