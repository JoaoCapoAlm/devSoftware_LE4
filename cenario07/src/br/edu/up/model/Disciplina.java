package br.edu.up.model;

import java.util.Dictionary;
import java.util.List;

public class Disciplina {
    private String Nome;
    private String Identificador;
    private String Curriculo;
    private List<Competencia> Competencias;

    public Disciplina(String nome, String identificador, String curriculo, List<Competencia> competencias) {
        Nome = nome;
        Identificador = identificador;
        Curriculo = curriculo;
        Competencias = competencias;
    }

    public String getNome() {
        return Nome;
    }

    public String getIdentificador() {
        return Identificador;
    }

    public String getCurrículo() {
        return Curriculo;
    }

    public List<Competencia> getCompetencias() {
        return Competencias;
    }

    public void addCompetencia(Competencia competencia) {
        Competencias.add(competencia);
    }

    public int qtdIsNecessario(){
        int qtdNecessario = 0;
        for(var competencia : Competencias){
            if(competencia.getIsNecessaria())
                qtdNecessario++;
        }

        return qtdNecessario;
    }

    public int qtdIsComplementar(){
        int qtdComplementar = 0;
        for(var competencia : Competencias){
            if(!competencia.getIsNecessaria())
                qtdComplementar++;
        }

        return qtdComplementar;
    }
}
