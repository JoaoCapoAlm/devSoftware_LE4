package br.edu.up.model;

public class Cidade {
    private String nome;
    private String UF;

    public Cidade(String nome, String uf) {
        this.nome = nome;
        this.UF = uf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String uf) {
        UF = uf;
    }

    @Override
    public String toString() {
        return getNome() + " - " + getUF();
    }
}
