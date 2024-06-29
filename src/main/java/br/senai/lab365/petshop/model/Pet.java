package br.senai.lab365.petshop.model;

public class Pet {

    private static int nextId = 1;
    private int id;
    private String nome;
    private String tipo;
    private Tutor tutor;

    public Pet(String nome, String tipo, Tutor tutor) {
        this.id = nextId++;
        this.nome = nome;
        this.tipo = tipo;
        this.tutor = tutor;
    }

    public int getId() {
        return id;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
