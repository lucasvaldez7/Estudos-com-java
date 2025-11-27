import br.com.alura.audios.modelos.Audio;
import br.com.alura.audios.modelos.Musica;

public class Main {
    public static void main(String[] args) throws Exception {

        Audio musica = new Musica();
        musica.setTitulo("Tentar ser Breve");
        musica.setDuracao(4);
        
        musica.exibirInfo();

    }
}
