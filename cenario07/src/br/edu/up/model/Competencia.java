package br.edu.up.model;

public class Competencia {
    private String Nome;
    private boolean IsNecessaria;

    public Competencia(String nome, boolean isNecessaria)
    {
        Nome = nome;
        IsNecessaria = isNecessaria;
    }

    public String getNome() {
        return Nome;
    }

    public boolean getIsNecessaria() {
        return IsNecessaria;
    }
}
