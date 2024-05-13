package br.edu.up.view;

import br.edu.up.controller.ControleAcademicoController;
import br.edu.up.enums.Situacao;
import br.edu.up.enums.Turno;
import br.edu.up.model.*;

import java.util.ArrayList;
import java.util.List;

public class ControleAcademicoView {
    private ControleAcademicoController _controller = new ControleAcademicoController();
    public void ControleAcademico() {
        var competencia1 = _controller.NewCompetencia("GIT", false);
        var competencia2 = _controller.NewCompetencia("Java", true);

        List<Competencia> competenciasDisciplina1 = new ArrayList<Competencia>();
        competenciasDisciplina1.add(competencia1);
        competenciasDisciplina1.add(competencia2);

        var aluno = _controller.NewAluno(2023, "ADS", Turno.Noite, "João", "987654", "456789");

        var alunoCompetencia = _controller.newAlunoCompetencia(competencia1, Situacao.Aprovado);
        aluno.AddCompetencia(alunoCompetencia);

        alunoCompetencia = _controller.newAlunoCompetencia(competencia2, Situacao.Reprovado);
        aluno.AddCompetencia(alunoCompetencia);

        var disciplina1 = _controller.newDisciplina(
                "Desenvolvimento de Software",
                "1",
                "lorem ipsum",
                competenciasDisciplina1
        );

        var alunoDisciplina = _controller.newAlunoDisciplina(aluno, disciplina1);

        System.out.println(aluno.GetNome() + " - " + disciplina1.getNome() + " - " + alunoDisciplina.getSituacao());
    }
}
