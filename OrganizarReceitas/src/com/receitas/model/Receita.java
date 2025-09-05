package com.receitas.model;

import java.util.List;

    public class Receita {
        //declaração dos atributos da classe receita
        private String nome;
        private String modoDePreparo;
        private List<Ingrediente> ingredientes;

        // construtor da classe recita iniciando todos os atributos
        public Receita(String nome, String modoDePreparo, List<Ingrediente> ingredientes) {
            this.nome = nome;
            this.modoDePreparo = modoDePreparo;
            this.ingredientes = ingredientes;
        }
            // métodos getter
        public String getNome() {
            return nome;
        }

        public String getModoDePreparo() {
            return modoDePreparo;
        }

        public List<Ingrediente> getIngredientes() {
            return ingredientes;
        }
    }
