package br.edu.up.view;

import br.edu.up.controller.PessoaController;
import br.edu.up.model.ClientePessoa;

import java.util.Scanner;

public class ClientePessoaView {
    private final Scanner _scanner;
    private PessoaController _controller;

    public ClientePessoaView(PessoaController pessoaController){
        _scanner = new Scanner(System.in);
        _controller = pessoaController;
    }
    public void IncluirCliente() {
        System.out.println("Digite os dados do cliente");


        try {
            System.out.println("CPF");
            var cpf = _scanner.nextLine();
            System.out.println("Limite de crédito");
            var maxCredito = _scanner.nextDouble();
            _scanner.nextLine();

            var clientePessoa = new ClientePessoa(maxCredito, cpf);
            System.out.println("Nome");
            clientePessoa.setNome(_scanner.nextLine());
            System.out.println("E-mail");
            clientePessoa.setEmail(_scanner.nextLine());
            System.out.println("Telefone");
            clientePessoa.setTelefone(_scanner.nextLine());
            clientePessoa.emprestar(1000);

            _controller.AddCliente(clientePessoa);
            System.out.println("Cliente cadastrado!");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void ShowCliente(){
        System.out.println("Digite o CPF do cliente que deseja verificar os dados");
        var cpf = _scanner.nextLine();
        var cliente = _controller.GetCliente(cpf);

        if(cliente == null)
            System.out.println("Cliente não encontrado!");
        else
            System.out.println(cliente);
    }

    public void Emprestar(){
        System.out.println("Digite o CPF do cliente");
        var documento = _scanner.nextLine();

        System.out.println("Valor a ser emprestado");
        var valor = _scanner.nextDouble();
        _scanner.nextLine();

        var emprestimo = _controller.Emprestar(documento, valor);
        System.out.println(emprestimo);
    }

    public void Devolver(){
        System.out.println("Digite o CPF do cliente");
        var documento = _scanner.nextLine();

        System.out.println("Valor a ser devolvido");
        var valor = _scanner.nextDouble();
        _scanner.nextLine();

        var operacao = _controller.Devolver(documento, valor);
        System.out.println(operacao);
    }
}
