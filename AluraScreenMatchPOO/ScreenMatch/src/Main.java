import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Zootopia 2");
        meuFilme.setDuracaoEmMinutos(108);
        meuFilme.setAnoLancamento (2025);
        

        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        
        System.out.println("A média das avaliações é: "+ meuFilme.ObterMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoLancamento(2000);
        lost.exibirFichaTecnica();
        lost.setTemporadas(7);
        lost.setEpisodiosPorTemporada(10);
        
        

    }   
}
