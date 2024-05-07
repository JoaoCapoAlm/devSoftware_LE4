package br.edu.up.model;

public abstract class Pessoa {
    private String Nome;
    private String Rg;
    private String Matricula;

    public Pessoa(String nome, String rg, String matricula) {
        Nome = nome;
        Rg = rg;
        Matricula = matricula;
    }
}