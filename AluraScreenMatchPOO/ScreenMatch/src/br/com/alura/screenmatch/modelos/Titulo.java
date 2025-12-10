package br.com.alura.screenmatch.modelos;

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
    }

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
    public int compareTo(Titulo outroTitulo) {
        
       return this.getNome().compareTo(outroTitulo.getNome());
    }
}
 
