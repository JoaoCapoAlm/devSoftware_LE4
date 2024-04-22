package br.edu.up.model;

public class Compromisso {
    public String Pessoa;
    public String Local;
    public String Assunto;
    public int Hora;

    public Compromisso(String pessoa, String local, String assunto, int hora) {
        Pessoa = pessoa;
        Local = local;
        Assunto = assunto;
        Hora = hora;
    }

    public void setPessoa(String pessoa) {
        Pessoa = pessoa;
    }

    public String getPessoa() {
        return Pessoa;
    }

    public void setLocal(String local) {
        Local = local;
    }

    public String getLocal() {
        return Local;
    }

    public void setAssunto(String assunto) {
        Assunto = assunto;
    }

    public String getAssunto() {
        return Assunto;
    }

    public void setHora(int hora) {
        Hora = hora;
    }

    public int getHora() {
        return Hora;
    }

    @Override
    public String toString() {
        return "Compromisso: \n" +
                "Pessoa: " + Pessoa + '\n' +
                ", Local='" + Local + '\n' +
                ", Assunto:" + Assunto + '\n' +
                ", Hora=" + Hora;
    }
}
