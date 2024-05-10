package br.edu.up;

import br.edu.up.view.ContatoView;

public class Programa {
    public static void main(String[] args) {
        var view = new ContatoView();
        view.NewPessoal();
        view.NewComercial();
        view.ExcluirContato();
        view.BuscarContato();
        view.ListarContatos();
    }
}