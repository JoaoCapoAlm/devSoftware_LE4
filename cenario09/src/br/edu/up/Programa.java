package br.edu.up;

import br.edu.up.view.ClientePessoaView;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner _scanner = new Scanner(System.in);
        var pessoaView = new ClientePessoaView();
        var empresaView = new ClientePessoaView();

        var continuarAplicacao = true;
        while (continuarAplicacao){
            ShowMenu();

            System.out.println("Digite a opção do menu");
            var opcao = _scanner.nextInt();

            switch (opcao) {
                case 1 -> pessoaView.IncluirCliente();
                case 2 -> empresaView.IncluirCliente();
                default -> continuarAplicacao = false;
            }
        }
    }

    private static void ShowMenu() {
        System.out.println("-----Menu-----");
        System.out.println("1) Incluir cliente pessoa");
        System.out.println("2) Incluir cliente empresa");
        System.out.println("3) Mostrar dados cliente pessoa");
        System.out.println("4) Mostrar dados cliente empresa");
        System.out.println("5) Emprestar para cliente pessoa ");
        System.out.println("6. Emprestar para cliente empresa");
        System.out.println("7) Devolução de cliente pessoa");
        System.out.println("8) Devolução de cliente empresa");
        System.out.println("9) Sair ");
        System.out.println();
    }
}