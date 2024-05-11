package br.edu.up;

import br.edu.up.view.EstacionamentoView;

import java.util.Scanner;

public class Programa {
    public static Scanner _scanner = new Scanner(System.in);


    public static void main(String[] args) {
        var view = new EstacionamentoView();

        var continuarPrograma = true;
        while (continuarPrograma){
            Menu();

            switch (_scanner.nextLine()) {
                case "1" -> view.EntrarCarro();
                case "2" -> view.SaidaCarro();
                case "3" -> view.EmitirRelatorio();
                default -> continuarPrograma = false;
            }
        }
    }

    public static void Menu(){
        System.out.println();
        System.out.println("--- Menu ---");
        System.out.println("1 - Cadastrar novo carro");
        System.out.println("2 - Remover carro");
        System.out.println("3 - Emitir relatório");
        System.out.println("4 - Sair do programa");
        System.out.println();
    }
}
