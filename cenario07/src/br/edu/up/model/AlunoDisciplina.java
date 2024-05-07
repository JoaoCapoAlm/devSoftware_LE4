package br.edu.up.model;

import br.edu.up.enums.Situacao;

public class AlunoDisciplina {
    private Aluno aluno;
    private Disciplina disciplina;
    private Situacao situacao;

    public AlunoDisciplina(Aluno aluno, Disciplina disciplina) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        situacao = Situacao.Pendente;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }
}
