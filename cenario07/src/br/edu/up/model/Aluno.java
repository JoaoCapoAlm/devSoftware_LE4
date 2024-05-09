package br.edu.up.model;
import br.edu.up.enums.Turno;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private int AnoIngresso;
    private String NomeCurso;
    private Turno Turno;
    private List<AlunoCompetencia> alunoCompetencias;

    public Aluno(int anoIngresso, String nomeCurso, Turno turno, String nome, String rg, String matricula)
    {
        super(nome, rg, matricula);
        AnoIngresso = anoIngresso;
        NomeCurso = nomeCurso;
        Turno = turno;
        alunoCompetencias = new ArrayList<>();
    }

    public void AddCompetencia(AlunoCompetencia alunoCompetencia){
        alunoCompetencias.add(alunoCompetencia);
    }

    public List<AlunoCompetencia> Competencias(){
        return alunoCompetencias;
    }
}
