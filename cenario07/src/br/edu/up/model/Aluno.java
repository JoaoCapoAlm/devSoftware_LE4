package br.edu.up.model;
import br.edu.up.enums.Turno;

public class Aluno extends Pessoa {
    private int AnoIngresso;
    private String NomeCurso;
    private Turno Turno;

    public Aluno(int anoIngresso, String nomeCurso, Turno turno, String nome, String rg, String matricula)
    {
        super(nome, rg, matricula);
        AnoIngresso = anoIngresso;
        NomeCurso = nomeCurso;
        Turno = turno;
    }
}
