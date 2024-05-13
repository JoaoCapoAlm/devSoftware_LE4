package br.edu.up.model;

public class Endereco {
    private String rua;
    private String numero;
    private String bairro;
    private Cidade cidade;
    private String cep;

    public Endereco(String rua, String numero, String bairro, Cidade cidade, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder(getRua());
        sb.append(", ")
            .append(getNumero())
            .append(" - ")
            .append(getBairro())
            .append(" - ")
            .append(getCidade().toString())
            .append(" - ")
            .append(getCep());

        return sb.toString();
    }
}
