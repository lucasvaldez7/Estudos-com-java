package br.com.lucas.academia.model;

import br.com.lucas.academia.Exercicio;

import java.util.ArrayList;
import java.util.List;

public class Treino {
    private String nome;
    List<Exercicio> listaExercicio;

    public Treino(String nome) {
        this.nome = nome;
        this.listaExercicio = new ArrayList<>();
    }

    public void adicionarExercicios(Exercicio exercicio){
            listaExercicio.add(exercicio);

    }
    public void listarExercicios(){

        System.out.println("Treino " + nome + ":");
        for (Exercicio e : listaExercicio){
            System.out.println(" " + e);

        }
    }
}
