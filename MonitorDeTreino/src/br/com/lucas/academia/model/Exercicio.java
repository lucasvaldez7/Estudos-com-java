package br.com.lucas.academia.model;

public class Exercicio {
    private String nome;
    private double pesoMaximo;

    public Exercicio(String nome, double pesoMaximo) {
        this.nome = nome;
        this.pesoMaximo = pesoMaximo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }


    public void setPesoMaximo(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    @Override
    public String toString() {
        return "Exercicio: " + nome +
                ", Peso Máximo: " + pesoMaximo;
    }
}
