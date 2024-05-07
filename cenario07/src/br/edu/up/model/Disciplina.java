package br.edu.up.model;

import java.util.List;

public class Disciplina {
    private String Nome;
    private String Identificador;
    private String Currículo;
    private List<Competencia> Competencias;

    public Disciplina(String nome, String identificador, String currículo, List<Competencia> competencias) {
        Nome = nome;
        Identificador = identificador;
        Currículo = currículo;
        Competencias = competencias;
    }

    public String getNome() {
        return Nome;
    }

    public String getIdentificador() {
        return Identificador;
    }

    public String getCurrículo() {
        return Currículo;
    }

    public List<Competencia> getCompetencias() {
        return Competencias;
    }

    public void addCompetencia(Competencia competencia) {
        Competencias.add(competencia);
    }
}
