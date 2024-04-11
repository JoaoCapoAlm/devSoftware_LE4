import Modelo.Livro;

import java.util.Arrays;

public class Programa {
    public static void main(String[] args) {
        System.out.println("Cenário 01");
        var livro1 = new Livro("1598FHK",
                "Core Java 2",
                new String[] { "Cay S. Horstmann", "Gary Cornell" },
                "0130819336",
                2005);

        System.out.println("Livro 1");
        System.out.println("Título: " + livro1.getTitulo());
        var autores = livro1.getAutor();
        for(var autor : autores){
            System.out.println("Autor: " + autor);
        }
        System.out.println("Ano" + livro1.getAno());
        System.out.println("Código: " + livro1.getCodigo());

        var livro2 = new Livro("9865PLO",
                "Java, How to Program",
                new String[] { "Harvey Deitel" },
                "0130341517",
                2015);

        System.out.println("Livro 2");
        System.out.println("Título: " + livro2.getTitulo());
        autores = livro2.getAutor();
        for(var autor : autores){
            System.out.println("Autor: " + autor);
        }
        System.out.println("Ano" + livro2.getAno());
        System.out.println("Código: " + livro2.getCodigo());
        System.out.println();
        System.out.println("------------------------");
        System.out.println();
    }
}
