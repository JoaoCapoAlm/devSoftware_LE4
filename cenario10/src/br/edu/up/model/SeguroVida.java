package br.edu.up.model;

public class SeguroVida extends Seguro {
    private boolean CobreDoenca;
    private boolean CobreAcidente;

    public boolean getCobreDoenca() {
        return CobreDoenca;
    }

    public void setCobreDoenca(boolean CobreDoenca) {
        this.CobreDoenca = CobreDoenca;
    }

    public boolean getCobreAcidente() {
        return CobreAcidente;
    }

    public void setCobreAcidente(boolean CobreAcidente) {
        this.CobreAcidente = CobreAcidente;
    }

    @Override
    public String getDados() {
        return super.getDados()
                + "\nCobre doença: "
                + (getCobreDoenca() ? "sim" : "não")
                + "\nCobre acidente: "
                + (getCobreAcidente() ? "sim" : "não");
    }
}
