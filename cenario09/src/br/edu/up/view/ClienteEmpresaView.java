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

}
