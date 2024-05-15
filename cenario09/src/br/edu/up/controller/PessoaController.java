package br.edu.up.controller;

import br.edu.up.model.ClientePessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaController {
    private List<ClientePessoa> _clientes = new ArrayList<>();

    public void AddCliente(ClientePessoa cliente){
        _clientes.add(cliente);
    }

    public ClientePessoa GetCliente(String documento) {
        for (ClientePessoa cliente : _clientes) {
            if(cliente.getCpf().equals(documento)){
                return cliente;
            }
        }

        return null;
    }

    public String Emprestar(String documento, double valor){
        try {
            var cliente = GetCliente(documento);
            cliente.emprestar(valor);

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
