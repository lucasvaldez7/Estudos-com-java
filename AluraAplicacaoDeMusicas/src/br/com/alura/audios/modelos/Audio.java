package br.com.alura.audios.modelos;

public class Audio {
    private String titulo;
    private int totalDeReproducoes; 
    private int curtidas;
    private int classificacao;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getTitulo() {
        return titulo;
    }
    

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }


    public int getCurtidas() {
        return curtidas;
    }


    public int getClassificacao() {
        return classificacao;
    }


    public void exibirInfo() {

        System.out.println("Título: " + titulo);
        System.out.println("Total de Reproduções: " + totalDeReproducoes);
        System.out.println("Curtidas: " + curtidas);
    
    }

    public void curte(){
        this.curtidas++;
    }
    public void reproduz(){
        this.totalDeReproducoes++;
    }
}
