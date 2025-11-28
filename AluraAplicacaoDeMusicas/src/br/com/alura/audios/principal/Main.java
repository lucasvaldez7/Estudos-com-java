package br.com.alura.audios.principal;
import br.com.alura.audios.modelos.Audio;
import br.com.alura.audios.modelos.Musica;
import br.com.alura.audios.modelos.Podcasts;
import br.com.alura.audios.modelos.MinhasPreferidas;

public class Main {
    public static void main(String[] args) throws Exception {

       Musica musica1 = new Musica();
        musica1.setTitulo("Tentar ser Breve");
        musica1.setArtista("Kayblack");
       

        for (int i = 0; i < 1000; i++) {
            musica1.reproduz();
        }

        for (int i = 0; i < 500; i++) {
            musica1.curte();
        }
        musica1.exibirInfo();
        Podcasts podcast = new Podcasts();
        podcast.setTitulo("Podpah");
        podcast.setApresentador("Igor 3K");

        for (int i = 0; i < 1000; i++) {
           podcast.reproduz();
        }

        for (int i = 0; i < 500; i++) {
            podcast.curte();
        }
       
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(musica1);
        preferidas.inclui(podcast);

    }
}
