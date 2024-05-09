package br.edu.up.model;

import br.edu.up.enums.Situacao;

public class AlunoCompetencia {
    private Competencia competencia;
    private Situacao situacao;

    public AlunoCompetencia(Competencia competencia) {
        this.competencia = competencia;
        this.situacao = Situacao.Pendente;
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
