package br.edu.up;

import br.edu.up.view.EventoView;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        var eventoView = new EventoView();
        var sc = new Scanner(System.in);

        boolean continuarAplicacao = true;
        int opcao;
        do {
            showMenu();
            System.out.println("Digite a opção escolhida");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> eventoView.ShowEventos();
                case 2 -> eventoView.AddEvento();
                default -> continuarAplicacao = false;
            }
        }
        while (continuarAplicacao);
    }

    private static void showMenu() {
        System.out.println("-----Menu-----");
        System.out.println("1) Ver eventos");
        System.out.println("2) Criar evento");
    }
}