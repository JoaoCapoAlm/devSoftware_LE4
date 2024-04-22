package br.edu.up.model;

import java.io.Console;

public class Mes {
    public String Nome;
    public int QtdDias;
    public Dia[] Dias;

    public Mes(String nome, int qtdDias) {
        Nome = nome;
        QtdDias = qtdDias;
        Dias = new Dia[qtdDias];
    }

    public boolean AdicionarCompromisso(Compromisso comp, int diaMes) {
        return Dias[diaMes].AdicionarCompromisso(comp);
    }

    public boolean AdicionarCompromisso(String pessoa, String local, String assunto, int hora, int diaMes) {
        try {
            var comp = new Compromisso(pessoa, local, assunto, hora);
            return Dias[diaMes].AdicionarCompromisso(comp);
        }
        catch (Exception e) {
            System.out.println("Erro ao adicionar compromisso!");
            System.out.println(e.getMessage());
            return false;
        }
    }

    public void ExcluirCompromisso(int diaMes, int hora) {
        Dias[diaMes].ExcluirCompromisso(hora);
    }

    public Compromisso[] ListarCompromissos(int diaMes) {
        return Dias[diaMes].ListarCompromisso();
    }

    public Dia[] ListarCompromissos() {
        return Dias;
    }
}
