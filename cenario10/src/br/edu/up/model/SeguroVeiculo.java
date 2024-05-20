package br.edu.up.model;

public class SeguroVeiculo extends Seguro {
    private double VlrFranquia;
    private boolean TemCarroReserva;
    private boolean CobreVidros;

    private double getVlrFranquia(){
        return VlrFranquia;
    }

    private void setVlrFranquia(double vlrFranquia){
        this.VlrFranquia = vlrFranquia;
    }

    private boolean getTemCarroReserva(){
        return TemCarroReserva;
    }

    private void setTemCarroReserva(boolean temCarroReserva){
        this.TemCarroReserva = temCarroReserva;
    }

    private boolean getCobreVidros(){
        return CobreVidros;
    }

    private void setCobreVidros(boolean cobreVidros){
        this.CobreVidros = cobreVidros;
    }

    @Override
    public String getDados() {
        return super.getDados()
                + "\nValor da franquia: " + getVlrFranquia()
                + "\nTem carro reserva: "
                + (getTemCarroReserva() ? "sim" : "nao")
                + "\nCobre vidros: "
                + (getCobreVidros()  ? "sim" : "nao");
    }
}
