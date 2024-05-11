package br.edu.up.view;

import br.edu.up.controller.EstacionamentoController;

import java.util.Scanner;

public class EstacionamentoView {
    private final EstacionamentoController _controller;
    private Scanner _scanner;

    public EstacionamentoView() {
        _controller = new EstacionamentoController();
        _scanner = new Scanner(System.in);
    }

    public void EntrarCarro(){
        System.out.println("Insira os dados do carro que está entrando");
        System.out.println("Modelo:");
        var modelo = _scanner.nextLine();
        System.out.println("Placa");
        var placa = _scanner.nextLine();
        System.out.println("Cor");
        var cor = _scanner.nextLine();

        if(_controller.EntradaCarro(modelo, placa, cor))
            System.out.println("Carro estacionado!");
        else
            System.out.println("Estacionamento lotado");
    }

    public void SaidaCarro(){
        System.out.println("Placa do carro que está saindo");
        var placa = _scanner.nextLine();

        _controller.SaidaCarro(placa);
    }

    public void EmitirRelatorio(){
        var relatorio = _controller.QuantidadeVagasOcupadas();
        var valores = relatorio.split(" - ");

        System.out.println("Carros que entraram: " + valores[0]);
        System.out.println("Carros que sairam:" + valores[1]);
        System.out.println("Valor arrecadado no perído: " + (Integer.parseInt(valores[1]) * 5));
    }
}
