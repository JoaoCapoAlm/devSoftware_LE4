package br.edu.up.model;

public class Evento {
    private String nome;
    private String data;
    private String local;
    private int lotacaoMaxima;
    private double preco;

    public Evento(String nome, String data, String local, double preco) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.preco = preco;
    }

    public void setLotacaoMaxima(int lotacaoMaxima) throws Exception {
        if(lotacaoMaxima < 0){
            throw new Exception("Lotação inválida!");
        }
        this.lotacaoMaxima = lotacaoMaxima;
    }

    @Override
    public String toString() {
        return nome + " (" + data.toString() + ")\nlocal: " + local + "\nlotação: " + lotacaoMaxima;
    }
}
