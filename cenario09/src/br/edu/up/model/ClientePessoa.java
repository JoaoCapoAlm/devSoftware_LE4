package br.edu.up.model;

public class ClientePessoa extends Cliente {
    private String cpf;
    private double peso;
    private double altura;

    public ClientePessoa(double credito, String cpf) {
        super(credito);

        setCpf(cpf);

        if(credito > 10000)
            throw new IllegalArgumentException("Limite de crédito ultrapassado!");
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return getNome() + " (" + getCpf() + "): valor emprestado: R$ " + getVlrEmprestado();
    }
}
