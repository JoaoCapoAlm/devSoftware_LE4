package Modelo;

import java.time.Year;
import java.util.Arrays;

public class Livro {
    private String Codigo;
    private String Titulo;
    private String[] Autor;
    private String Isbn;
    private int Ano;

    public Livro(String codigo, String titulo, String[] autor, String isbn, int ano){
        Codigo = codigo;
        Titulo = titulo;
        Autor = autor;
        Isbn = isbn;
        Ano = ano;
    }

    @Override
    public String toString() {
        return Isbn + " - " + Titulo + "(" + Ano + ")";
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String[] getAutor() {
        return Autor;
    }

    public void setAutor(String[] autor) {
        var autorList = Arrays.asList(Autor);
        for(String a : autor){
            if(!autorList.contains(a)){
                autorList.add(a);
            }
        }
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int ano) {
        if(ano > 0 && ano <= Year.now().getValue()){
            Ano = ano;
        }
        else
            throw new IllegalArgumentException("Ano inválido!");
    }
}
