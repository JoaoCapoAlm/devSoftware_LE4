package br.edu.up.model;

public class Ponto {
    private double X;
    private double Y;

    public Ponto(){
        X = 0;
        Y = 0;
    }

    public Ponto(double x, double y) {
        X = x;
        Y = y;
    }

    public void setX(double x) {
        X = x;
    }

    public double getX() {
        return X;
    }

    public void setY(double y) {
        Y = y;
    }

    public double getY() {
        return Y;
    }

    public double distancia(double x, double y) {
        return Math.sqrt(Math.pow(X - x, 2) + Math.pow(Y - y, 2));
    }

    public double distancia(Ponto p) {
        return distancia(p.getX(), p.getY());
    }
}
