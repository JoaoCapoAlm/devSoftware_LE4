package br.edu.up.view;

import br.edu.up.controller.PessoaController;
import br.edu.up.model.ClientePessoa;

import java.util.Scanner;

public class ClientePessoaView {
    private final Scanner _scanner;
    private PessoaController _controller;

    public ClientePessoaView(){
        _scanner = new Scanner(System.in);
        _controller = new PessoaController();
    }
    public void IncluirCliente() {
        var maxCredito = _scanner.nextDouble();
        _scanner.nextLine();

        try {
            var cpf = _scanner.nextLine();
            var clientePessoa = new ClientePessoa(maxCredito, cpf);
            clientePessoa.setNome(_scanner.nextLine());
            clientePessoa.setEmail(_scanner.nextLine());
            clientePessoa.setTelefone(_scanner.nextLine());
            clientePessoa.emprestar(1000);

            _controller.AddCliente(clientePessoa);
            System.out.println("Cliente cadastrado!");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
