package com.receitas.service;

import com.receitas.model.Receita;

import java.util.ArrayList;
import java.util.List;

public class OrganizadorDeReceitas {

    private List<Receita> colecaoDeReceitas = new ArrayList<>();


    public void adicionarReceita(Receita receita){
            colecaoDeReceitas.add(receita);

    }
    public void removerReceita(String nomeDaReceita){
            for (int i = 0; i < colecaoDeReceitas.size(); i++){
                Receita receitaAtual = colecaoDeReceitas.get(i);

                if(receitaAtual.getNome() .equalsIgnoreCase(nomeDaReceita)) {
                    colecaoDeReceitas.remove(i);

                    System.out.printf("\nReceita %s, removida com sucesso",nomeDaReceita);
                    return;
                }

            }
            System.out.printf("\nReceita %s não encontrada", nomeDaReceita);
    }

}
