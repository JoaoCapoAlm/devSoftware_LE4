package br.edu.up.model;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private Disciplina disciplina;
    private Professor professor;
    private List<Aluno> alunos;

    public Turma(Disciplina disciplina, Professor professor, List<Aluno> alunos) {
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = alunos;
    }
}
