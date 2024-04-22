package br.edu.up;

import br.edu.up.model.Ponto;

public class Programa {
    public static void main(String[] args) {
        var ponto1 = new Ponto();
        var ponto2 = new Ponto(2, 5);

        System.out.println("Distância entre ponto 1 e ponto 2: " + ponto1.distancia(ponto2));
        System.out.println("Distância entre ponto 2 às coordenadas (7, 2): " + ponto2.distancia(7, 2));

        ponto1.setX(10);
        ponto1.setY(3);
    }
}
