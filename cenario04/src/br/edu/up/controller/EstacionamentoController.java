package br.edu.up.controller;

import br.edu.up.model.Carro;
import netscape.javascript.JSObject;

import java.util.ArrayList;
import java.util.List;

public class EstacionamentoController {
    private List<Carro> _vagas;
    private int _maxCarros;
    private int _entraramNoPeriodo;

    public EstacionamentoController(){
        _maxCarros = 10;
        _vagas = new ArrayList<>(_maxCarros);
        _entraramNoPeriodo = 0;
    }

    public boolean EntradaCarro(String modelo, String placa, String cor){
        if(_vagas.size() >= _maxCarros)
            return false;

        var carro = new Carro(modelo, placa, cor);

        _vagas.add(carro);
        _entraramNoPeriodo++;
        return true;
    }

    public void SaidaCarro(String placa){
        for (var i = 0; i < _vagas.size(); i++){
            if(_vagas.get(i).getPlaca().equals(placa)){
                _vagas.remove(i);
                break;
            }
        }
    }

    public String QuantidadeVagasOcupadas(){
        var sairam = _entraramNoPeriodo - _vagas.size();
        return  _entraramNoPeriodo + " - " + sairam;
    }
}
