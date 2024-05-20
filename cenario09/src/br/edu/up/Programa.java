package br.edu.up;

import br.edu.up.view.ClienteView;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner _scanner = new Scanner(System.in);

        var view = new ClienteView();

        var continuarAplicacao = true;
        while (continuarAplicacao){
            ShowMenu();

            System.out.println("Digite a opção do menu");
            var opcao = _scanner.nextInt();

            switch (opcao) {
                case 1 -> view.IncluirCliente();
                case 2 -> view.ShowCliente();
                case 3 -> view.Emprestar();
                case 4 -> view.Devolver();
                default -> continuarAplicacao = false;
            }
        }
    }

    private static void ShowMenu() {
        System.out.println("-----Menu-----");
        System.out.println("1) Incluir cliente");
        System.out.println("2) Mostrar dados cliente");
        System.out.println("3) Emprestar para cliente ");
        System.out.println("4) Devolução de cliente");
        System.out.println("5) Sair ");
        System.out.println();
    }
}