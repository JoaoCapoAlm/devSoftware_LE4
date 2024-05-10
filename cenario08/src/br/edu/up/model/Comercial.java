package br.edu.up.model;

public class Comercial extends Contato {
    public String cnpj;

    public Comercial(int codigo, String nome, String telefone, String cnpj) {
        super(codigo, nome, telefone);
        this.cnpj = cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public String toString() {
        return getNome() + " - " + getTelefone();
    }
}
