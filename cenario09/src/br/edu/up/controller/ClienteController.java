package br.edu.up.controller;

import br.edu.up.model.Cliente;
import br.edu.up.model.ClienteEmpresa;
import br.edu.up.model.ClientePessoa;

import java.util.ArrayList;
import java.util.List;

public class ClienteController {
    private List<Cliente> _clientes = new ArrayList<>();

    public void AddCliente(Cliente cliente){
        _clientes.add(cliente);
    }

    public Cliente GetCliente(String documento) {
        for (Cliente cliente : _clientes) {
            if(cliente instanceof ClienteEmpresa empresa){
                if(empresa.getCnpj().equals(documento))
                    return cliente;
            } else {
                var pessoa = (ClientePessoa)cliente;
                if(pessoa.getCpf().equals(documento))
                    return cliente;
            }
        }

        return null;
    }

    public String Emprestar(String documento, double valor){
        try {
            var empresa = GetCliente(documento);
            empresa.emprestar(valor);

            return "Emprestado com sucesso!";
        } catch (Exception e){
            return "Não foi possível realizar o emprestimo! " + e.getMessage();
        }

    }

    public String Devolver(String documento, double valor){
        try {
            var cliente = GetCliente(documento);
            cliente.devolver(valor);

            return "Devolvido com sucesso!";
        } catch (Exception e){
            return "Não foi possível realizar a devolução! " + e.getMessage();
        }
    }
}
