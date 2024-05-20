package br.edu.up.controller;

import br.edu.up.model.Evento;

public class EventoController {
    private Evento[] listaEventos;

    public EventoController() {
        listaEventos = new Evento[100];
    }

    public Evento[] getListaEventos() {
        return listaEventos;
    }

    public void addEvento(Evento evento) {
        for (int i = 0; i < listaEventos.length; i++) {
            if(listaEventos[i] == null){
                listaEventos[i] = evento;
                return;
            }
        }
    }

    public void excluir(int index){
        listaEventos[index] = null;
    }
}
