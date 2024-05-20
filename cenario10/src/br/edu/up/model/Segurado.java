package br.edu.up.model;

import br.edu.up.enums.SexoEnum;

public class Segurado {
    private String Nome;
    private String RG;
    private String CPF;
    private SexoEnum Sexo;
    private String Telefone;
    private String Endereco;
    private String CEP;
    private String Cidade;

    public String getTelefone() {
        return Telefone;
    }
    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String rg) {
        RG = rg;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public SexoEnum getSexo() {
        return Sexo;
    }

    public void setSexo(SexoEnum sexo) {
        Sexo = sexo;
    }

    @Override
    public String toString() {
        return getNome() + " (" + getCPF() + ") - " + getTelefone();
    }
}
