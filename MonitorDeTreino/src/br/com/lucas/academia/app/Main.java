package br.com.lucas.academia.app;


import br.com.lucas.academia.Exercicio;
import br.com.lucas.academia.model.Treino;

public class Main{
    public static void main(String[] args) {
            Treino treino1 = new Treino("A");
            Exercicio exercicio1 = new Exercicio("Lat Pulldown ",40);
            treino1.adicionarExercicios(exercicio1);



    }


}
