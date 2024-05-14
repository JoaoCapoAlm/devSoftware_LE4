package br.edu.up.model;

public class ClienteEmpresa extends Cliente {
    private String cnpj;
    private String inscEstadual;
    private int AnoFundacao;

    public ClienteEmpresa(double credito) {
        super(credito);

        if(credito >= 25000)
            throw new IllegalArgumentException("Limite de crédito ultrapassado!");
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    public int getAnoFundacao() {
        return AnoFundacao;
    }

    public void setAnoFundacao(int AnoFundacao) {
        this.AnoFundacao = AnoFundacao;
    }
}
