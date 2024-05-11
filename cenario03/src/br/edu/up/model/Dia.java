package br.edu.up.model;

public class Dia {
    public int DiaMes;
    public Compromisso[] Compromissos;

    public Dia(int diaMes) {
        DiaMes = diaMes;
        Compromissos = new Compromisso[24];
    }

    public boolean AdicionarCompromisso(Compromisso compromisso) {
        if(compromisso == null)
            return false;
        var hora = compromisso.Hora;
        if(Compromissos[hora] == null){
            Compromissos[hora] = compromisso;
            return true;
        }

        return false;
    }

    public void ExcluirCompromisso(int hora){
        Compromissos[hora] = null;
    }

    public Compromisso ConsultarCompromisso(int hora) {
        return Compromissos[hora];
    }

    public String ListarCompromisso(){
        var sb = new StringBuilder("Dia ");
        sb.append(DiaMes).append("\n");

        for(Compromisso c : Compromissos){
            sb.append(c.toString()).append("\n\n");
        }
        return sb.toString();
    }
}
