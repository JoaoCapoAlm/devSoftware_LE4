package br.edu.up.controller;

import br.edu.up.model.Evento;

import java.util.ArrayList;
import java.util.List;

public class EventoController {
    private List<Evento> listaEventos;

    public EventoController() {
        listaEventos = new ArrayList<Evento>();
    }

    public List<Evento> getListaEventos() {
        return listaEventos;
    }

    public void addEvento(Evento evento) {
        listaEventos.add(evento);
    }
}
