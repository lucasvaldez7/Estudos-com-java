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


    }

}
