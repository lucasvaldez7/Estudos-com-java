package br.com.alura.screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.Titulo;

public class MainArrays {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Zootopia 2", 2016);
        meuFilme.avalia(10);
        Serie lost = new Serie("Lost", 2000);
        var FilmeDoPaulo = new Filme("Dogville", 2003);
        FilmeDoPaulo.avalia(8.9);

        List<Titulo> lista = new LinkedList<>();
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

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Dwayne Johnson");
        buscaPorArtista.add("Sandra Bullock");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois de ordenado: " + buscaPorArtista);
        Collections.sort(lista);
        System.out.println("Lista de títulos ordenados: " + lista);
        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));
    System.out.println("Ordenando por ano: " + lista);
    }
}
