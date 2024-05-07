package br.edu.up.model;

import br.edu.up.enums.Situacao;

public class AlunoCompetencia {
    private Aluno aluno;
    private Competencia competencia;
    private Situacao situacao;

    public AlunoCompetencia(Aluno aluno, Competencia competencia) {
        this.aluno = aluno;
        this.competencia = competencia;
        this.situacao = Situacao.Pendente;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Competencia getCompetencia() {
        return competencia;
    }

    public void setCompetencia(Competencia competencia) {
        this.competencia = competencia;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }
}
