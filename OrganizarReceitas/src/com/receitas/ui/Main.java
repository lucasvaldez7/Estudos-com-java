package com.receitas.ui;

import com.receitas.model.Receita;

public class Main {
    public static void main(String[] args) {
            Receita receita;
            receita = new Receita();

            receita.setNome("Bolo de Cenoura");

            receita.exibirReceita();
        }
    }