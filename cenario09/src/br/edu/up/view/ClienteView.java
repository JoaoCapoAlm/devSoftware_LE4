package br.edu.up.view;

import br.edu.up.controller.ClienteController;
import br.edu.up.model.ClienteEmpresa;
import br.edu.up.model.ClientePessoa;

import java.util.Scanner;

public class ClienteView {
    private final Scanner _scanner;
    private ClienteController _controller;

    public ClienteView(){
        _scanner = new Scanner(System.in);
        _controller = new ClienteController();
    }

    public void IncluirCliente() {
        System.out.println("Insira os dados do cliente");

        try {
            System.out.println("Documento");
            var documento = _scanner.nextLine()
                    .replace("/", "")
                    .replace("-", "")
                    .replace(".", "")
                    .trim();

            System.out.println("Limite de crédito");
            var maxCredito = _scanner.nextDouble();
            _scanner.nextLine();

            var cliente = documento.length() == 14
                    ? new ClienteEmpresa(maxCredito, documento)
                    : new ClientePessoa(maxCredito, documento);

            System.out.println("Nome");
            cliente.setNome(_scanner.nextLine());

            System.out.println("E-mail");
            cliente.setEmail(_scanner.nextLine());

            System.out.println("Telefone");
            cliente.setTelefone(_scanner.nextLine());

            _controller.AddCliente(cliente);
            System.out.println("Cliente cadastrado!");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void ShowCliente(){
        System.out.println("Digite o documento do cliente que deseja verificar os dados");
        var documento = _scanner.nextLine();
        var cliente = _controller.GetCliente(documento);

        if(cliente == null)
            System.out.println("Cliente não encontrado!");
        else
            System.out.println(cliente);
    }

    public void Emprestar(){
        System.out.println("Digite o documento do cliente");
        var documento = _scanner.nextLine();

        System.out.println("Valor a ser emprestado");
        var valor = _scanner.nextDouble();
        _scanner.nextLine();

        var emprestimo = _controller.Emprestar(documento, valor);
        System.out.println(emprestimo);
    }

    public void Devolver(){
        System.out.println("Digite o documento do cliente");
        var documento = _scanner.nextLine();

        System.out.println("Valor a ser devolvido");
        var valor = _scanner.nextDouble();
        _scanner.nextLine();

        var operacao = _controller.Devolver(documento, valor);
        System.out.println(operacao);
    }
}
