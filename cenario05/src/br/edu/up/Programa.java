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
                case 1 -> eventoView.Listar();
                case 2 -> eventoView.Adicionar();
                case 4 -> eventoView.Excluir();
                default -> continuarAplicacao = false;
            }
        }
        while (continuarAplicacao);
    }

    private static void showMenu() {
        System.out.println("-----Menu-----");
        System.out.println("1) Ver eventos");
        System.out.println("2) Criar evento");
        //System.out.println("3) Alterar evento");
        System.out.println("4) Excluir evento");

    }
}