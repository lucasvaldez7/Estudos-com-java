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

    

    public String getArtista() {
        return artista;
    }
    public String getAlbum() {
        return album;
    }
    public String getGenero() {
        return genero;
    }
    public void exibirDetalhes() {
        System.out.println("Artista: " + artista);
        System.out.println("Álbum: " + album);
        System.out.println("Gênero: " + genero);
    }
    @Override
    public int getClassificacao(){
        if (this.getCurtidas() >=500){
            return 10;
        } else {
            return 7;         
        }
        
    }
}
