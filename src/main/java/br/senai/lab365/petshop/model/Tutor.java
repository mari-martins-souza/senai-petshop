package br.senai.lab365.petshop.model;

public class Tutor {

    private static int nextId = 1;
    private int id;
    private String nome;
    private String endereco;

    public Tutor(String nome, String endereco) {
        this.id = nextId++;
        this.nome = nome;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
