package br.edu.up.controller;

import br.edu.up.model.ClienteEmpresa;

import java.util.ArrayList;
import java.util.List;

public class EmpresaController {
    private List<ClienteEmpresa> _clientes = new ArrayList<>();

    public void AddCliente(ClienteEmpresa cliente){
        _clientes.add(cliente);
    }
}
