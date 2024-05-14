package br.edu.up.controller;

import br.edu.up.model.ClientePessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaController {
    private List<ClientePessoa> _clientes = new ArrayList<>();

    public void AddCliente(ClientePessoa cliente){
        _clientes.add(cliente);
    }
}
