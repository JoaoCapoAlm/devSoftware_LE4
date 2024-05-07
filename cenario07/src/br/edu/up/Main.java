package br.edu.up;

import br.edu.up.model.Competencia;
import br.edu.up.model.Disciplina;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var competencia1 = new Competencia("GIT", false);
        var competencia2 = new Competencia("Java", true);

        List<Competencia> competenciasDisciplina1 = new ArrayList<Competencia>();
        competenciasDisciplina1.add(competencia1);
        competenciasDisciplina1.add(competencia2);

        var disciplina1 = new Disciplina(
                "Desenvolvimento de Software",
                "1",
                "lorem ipsum",
                competenciasDisciplina1
        );
    }
}