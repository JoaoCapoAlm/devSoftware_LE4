package br.edu.up.model;

public class Professor extends Pessoa {
    private String IdCurriculoLates;
    private Titulacao Titulo;

    public Professor(String nome, String rg, String matricula, String idCurriculo, Titulacao titulo) {
        super(nome, rg, matricula);

        IdCurriculoLates = idCurriculo;
        Titulo = titulo;
    }
}
