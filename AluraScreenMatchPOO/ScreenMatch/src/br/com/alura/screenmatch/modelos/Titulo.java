package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.exececao.ErroDeConversaoDeAnoException;


public class Titulo implements Comparable<Titulo> {

    private String nome;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacao;
    private int duracaoEmMinutos;

    

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        if(meuTituloOmdb.year().length() >4){
            throw new ErroDeConversaoDeAnoException("Não consegui converter o ano porque tem mais de 04 caracteres");

        }
        this.anoLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
    }

    public int getTotalAvaliacao() {
        return totalAvaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }  

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibirFichaTecnica() {
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento:" + anoLancamento);
;    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacao++;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public double ObterMedia() {
        return somaDasAvaliacoes / totalAvaliacao;
    }

    @Override
    public String toString() {
        return "nome: " + nome + '\'' +
                ", anoLancamento: " + anoLancamento + " duração: " + duracaoEmMinutos +
                '}';
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        
       return this.getNome().compareTo(outroTitulo.getNome());


    }
}
 
