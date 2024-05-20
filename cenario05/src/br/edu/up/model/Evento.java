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
        var sb = new StringBuilder(nome);
        sb.append(" (");
        sb.append(data);
        sb.append(")");
        sb.append('\n');
        sb.append("Local: ");
        sb.append(local);
        sb.append('\n');
        sb.append("Lotação: ");
        sb.append(lotacaoMaxima);
        sb.append('\n');
        sb.append("Preço: ");
        sb.append(preco);
        return sb.toString();
    }
}
