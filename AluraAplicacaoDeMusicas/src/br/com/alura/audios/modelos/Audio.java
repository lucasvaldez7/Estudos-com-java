package br.com.alura.audios.modelos;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private double classificacao;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }
    

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public void setClassificacao(double classificacao) {
        this.classificacao = classificacao;
    }

    public void exibirInfo() {

        System.out.println("Título: " + titulo);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Total de Reproduções: " + totalDeReproducoes);
        System.out.println("Curtidas: " + curtidas);
        System.out.println("Classificação: " + classificacao);
    
    }
}
