package br.edu.up;

import br.edu.up.enums.Situacao;
import br.edu.up.enums.Turno;
import br.edu.up.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var competencia1 = new Competencia("GIT", false);
        var competencia2 = new Competencia("Java", true);

        List<Competencia> competenciasDisciplina1 = new ArrayList<Competencia>();
        competenciasDisciplina1.add(competencia1);
        competenciasDisciplina1.add(competencia2);

        var aluno = new Aluno(2023, "ADS", Turno.Noite, "João", "987654", "456789");

        var alunoCompetencia = new AlunoCompetencia(competencia1);
        alunoCompetencia.setSituacao(Situacao.Aprovado);
        aluno.AddCompetencia(alunoCompetencia);

        alunoCompetencia = new AlunoCompetencia(competencia2);
        alunoCompetencia.setSituacao(Situacao.Reprovado);
        aluno.AddCompetencia(alunoCompetencia);

        var disciplina1 = new Disciplina(
                "Desenvolvimento de Software",
                "1",
                "lorem ipsum",
                competenciasDisciplina1
        );

        var alunoDisciplina = new AlunoDisciplina(aluno, disciplina1);

        alunoDisciplina.setSituacao();
        System.out.println(aluno.GetNome() + " - " + disciplina1.getNome() + " - " + alunoDisciplina.getSituacao());
    }
}