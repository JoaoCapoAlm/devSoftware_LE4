package br.edu.up.controller;

import br.edu.up.enums.Situacao;
import br.edu.up.enums.Turno;
import br.edu.up.model.*;

import java.util.List;

public class ControleAcademicoController {
    public Competencia NewCompetencia(String nome, boolean isNecesario){
        return new Competencia(nome, isNecesario);
    }

    public Aluno NewAluno(int anoIngresso, String nomeCurso, Turno turno, String nome, String rg, String matricula){
        return new Aluno(anoIngresso, nomeCurso, turno, nome, rg, matricula);
    }

    public AlunoCompetencia newAlunoCompetencia(Competencia competencia, Situacao situacao){
        var alunoCompetencia = new AlunoCompetencia(competencia);
        alunoCompetencia.setSituacao(situacao);

        return alunoCompetencia;
    }

    public Disciplina newDisciplina(String nome, String identificador, String curriculo, List<Competencia> competencias) {
        return new Disciplina(nome, identificador, curriculo, competencias);
    }

    public AlunoDisciplina newAlunoDisciplina(Aluno aluno, Disciplina disciplina){
        var alunoDisciplina = new AlunoDisciplina(aluno, disciplina);
        alunoDisciplina.setSituacao();

        return alunoDisciplina;
    }
}
