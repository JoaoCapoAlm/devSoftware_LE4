package br.edu.up.view;

import br.edu.up.controller.EmpresaController;
import br.edu.up.controller.PessoaController;
import br.edu.up.model.ClienteEmpresa;
import br.edu.up.model.ClientePessoa;

import java.util.Scanner;

public class ClienteEmpresaView {
    private final Scanner _scanner;
    private EmpresaController _controller;

    public ClienteEmpresaView(){
        _scanner = new Scanner(System.in);
        _controller = new EmpresaController();
    }

    public void IncluirCliente() {
        var maxCredito = _scanner.nextDouble();
        _scanner.nextLine();

        try {
            var cliente = new ClienteEmpresa(maxCredito);
            cliente.setNome(_scanner.nextLine());
            cliente.setEmail(_scanner.nextLine());
            cliente.setTelefone(_scanner.nextLine());
            cliente.setCnpj(_scanner.nextLine());
            cliente.emprestar(1000);

            _controller.AddCliente(cliente);
            System.out.println("Cliente cadastrado!");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void ShowCliente(){
        System.out.println("Digite o CNPJ do cliente que deseja verificar os dados");
        var documento = _scanner.nextLine();
        var cliente = _controller.GetCliente(documento);

        if(cliente == null)
            System.out.println("Cliente não encontrado!");
        else
            System.out.println(cliente);
    }

    public void Emprestar(){
        System.out.println("Digite o CNPJ do cliente");
        var documento = _scanner.nextLine();

        System.out.println("Valor a ser emprestado");
        var valor = _scanner.nextDouble();
        _scanner.nextLine();

        var emprestimo = _controller.Emprestar(documento, valor);
        System.out.println(emprestimo);
    }

    public void Devolver(){
        System.out.println("Digite o CNPJ do cliente");
        var documento = _scanner.nextLine();

        System.out.println("Valor a ser devolvido");
        var valor = _scanner.nextDouble();
        _scanner.nextLine();

        var operacao = _controller.Devolver(documento, valor);
        System.out.println(operacao);
    }
}
