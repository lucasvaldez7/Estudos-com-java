package br.com.alura.audios.modelos;

public class Musica extends Audio {
    private String artista;
    private String album;
    private String genero;

    public void setArtista(String artista) {
        this.artista = artista;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void exibirDetalhes() {
        System.out.println("Artista: " + artista);
        System.out.println("Álbum: " + album);
        System.out.println("Gênero: " + genero);
    }
    
}
