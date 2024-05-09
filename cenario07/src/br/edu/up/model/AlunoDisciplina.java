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

    public void setSituacao() {
        var competenciasAluno = aluno.Competencias();
        var competenciasDisciplina = disciplina.getCompetencias();

        int qtdNecessarioAprovado = 0;
        int qtdComplementaresAprovado = 0;

        for (AlunoCompetencia alunoCompetencia : competenciasAluno) {
            if (competenciasDisciplina.contains(alunoCompetencia.getCompetencia())) {
                var position = competenciasDisciplina.indexOf(alunoCompetencia.getCompetencia());
                var comp = competenciasDisciplina.get(position);

                if (alunoCompetencia.getSituacao() == Situacao.Aprovado) {
                    if (comp.getIsNecessaria())
                        qtdNecessarioAprovado++;
                    else
                        qtdComplementaresAprovado++;
                }
            }
        }

        if(disciplina.qtdIsNecessario() == qtdNecessarioAprovado
            && disciplina.qtdIsComplementar()/2 <= qtdComplementaresAprovado
        ){
            situacao = Situacao.Aprovado;
        } else if (disciplina.qtdIsNecessario()/2 > qtdNecessarioAprovado
            || disciplina.qtdIsComplementar()/2 > qtdComplementaresAprovado) {
            situacao = Situacao.Reprovado;
        } else {
            situacao = Situacao.Pendente;
        }
    }

    public Situacao getSituacao() {
        return situacao;
    }
}
