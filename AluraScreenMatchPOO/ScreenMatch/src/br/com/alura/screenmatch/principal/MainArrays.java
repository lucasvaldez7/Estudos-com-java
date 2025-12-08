package br.com.alura.screenmatch.principal;

import java.util.ArrayList;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class MainArrays {
    public static void main(String[] args) {
         Filme meuFilme = new Filme("Zootopia 2", 2016); 
         meuFilme.avalia(10);
         Serie lost = new Serie("Lost", 2000);
         var FilmeDoPaulo = new Filme( "Dogville", 2003);  
         FilmeDoPaulo.avalia(8.9);

         ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(FilmeDoPaulo);
        lista.add(meuFilme);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            } else {
                System.out.println("Não é um filme ou não passou na classificação");
            }
           
        }
    }
}
