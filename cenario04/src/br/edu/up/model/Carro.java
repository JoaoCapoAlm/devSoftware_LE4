package br.edu.up.model;

public class Carro {
    private String Modelo;
    private String Placa;
    private String Cor;

    public Carro(String modelo, String placa, String cor){
        Modelo = modelo;
        Placa = placa;
        Cor = cor;
    }

    public String getPlaca() {
        return Placa;
    }
}
