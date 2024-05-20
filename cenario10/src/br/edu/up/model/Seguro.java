package br.edu.up.model;

import java.time.LocalDate;

public abstract class Seguro {
    private String Apolice;
    private Segurado Segurado;
    private double vlrApolice;
    private LocalDate dtaInicio;
    private LocalDate dtaFim;

    public double getVlrApolice() {
        return vlrApolice;
    }

    public void setVlrApolice(double vlrApolice) {
        this.vlrApolice = vlrApolice;
    }

    public LocalDate getDtaInicio() {
        return dtaInicio;
    }

    public void setDtaInicio(LocalDate dtaInicio) {
        this.dtaInicio = dtaInicio;
    }

    public LocalDate getDtaFim() {
        return dtaFim;
    }

    public void setDtaFim(LocalDate dtaFim) {
        this.dtaFim = dtaFim;
    }

    public String getApolice() {
        return Apolice;
    }

    public void setApolice(String Apolice) {
        this.Apolice = Apolice;
    }

    public Segurado getSegurado() {
        return Segurado;
    }

    public void setSegurado(Segurado Segurado) {
        this.Segurado = Segurado;
    }

    public String getDados(){
        return getSegurado().toString()
                + "\nData de Inicio: " + getDtaInicio()
                + "\nData de Fim: " + getDtaFim()
                + "\nApólice: " + getApolice()
                + "\nValor da Apólice: " + getVlrApolice();
    }
}
