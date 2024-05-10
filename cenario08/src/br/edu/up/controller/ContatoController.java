package br.edu.up.controller;

import br.edu.up.model.Agenda;
import br.edu.up.model.Comercial;
import br.edu.up.model.Contato;
import br.edu.up.model.Pessoal;

public class ContatoController {
    private final Agenda _agenda;

    public ContatoController() {
        _agenda = new Agenda();
    }

    public void AdicionarPessoal(int codigo, String nome, String telefone, String aniversario) {
        var pessoal = new Pessoal(codigo, nome, telefone, aniversario);
        _agenda.adicionar(pessoal);
    }

    public void AdicionarComercial(int codigo, String nome, String telefone, String cnpj) {
        var comercial = new Comercial(codigo, nome, telefone, cnpj);
        _agenda.adicionar(comercial);
    }

    public boolean ExcluirContato(int codigo){
        return _agenda.excluirContato(codigo);
    }

    public Contato BuscaContato(int codigo){
        return _agenda.getContato(codigo);
    }

    public String ListarContatos(){
        return _agenda.listarContatos();
    }
}

