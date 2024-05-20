package br.edu.up.view;

import br.edu.up.controller.EventoController;
import br.edu.up.model.Evento;

import java.util.Scanner;

public class EventoView {
    private final EventoController _controller;
    private final Scanner sc;

    public EventoView() {
        _controller = new EventoController();
        sc = new Scanner(System.in);
    }

    public void Listar(){
        var eventos = _controller.getListaEventos();

        for(var i = 0; i < eventos.length; i++){
            System.out.print((i + 1) + ") ");
            System.out.println(eventos[i]);
            System.out.println();
        }
    }

    public void Adicionar(){
        System.out.println("Insira os dados do evento");

        try {
            System.out.println("Nome");
            var nome = sc.nextLine();
            System.out.println("Data");
            var data = sc.nextLine();
            System.out.println("Local");
            var local = sc.nextLine();
            System.out.println("Preço");

            var preco = sc.nextDouble();
            sc.nextLine();
            var evento = new Evento(nome, data, local, preco);

            System.out.println("Lotação máxima");
            var lotacao = sc.nextInt();
            sc.nextLine();
            evento.setLotacaoMaxima(lotacao);

            _controller.addEvento(evento);
        } catch (Exception e){
            System.out.println("Não foi possível adicionar o evento - " + e.getMessage());
        }
    }

    public void Excluir(){
        Listar();

        var evento = sc.nextInt();
        sc.nextLine();

        _controller.excluir(evento - 1);
    }
}
