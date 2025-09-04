package com.receitas.model;

import java.util.ArrayList;
import java.util.List;

    public class Receita {
        String nome;
        String modoDePreparo;
        List<Receita> Receita = new ArrayList<Receita>();
        public Receita(){
        }



        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setModoDePreparo(String modoDePreparo) {
            this.modoDePreparo = modoDePreparo;
        }

        public void setReceita(List<Receita> receita) {
            Receita = receita;
        }

        public String getNome() {
            return nome;
        }

        public String getModoDePreparo() {
            return modoDePreparo;
        }

        public List<Receita> getReceita() {
            return Receita;
        }

        public void exibirReceita(){
            System.out.println("Receita: "+ this.getNome());

        }
    }
