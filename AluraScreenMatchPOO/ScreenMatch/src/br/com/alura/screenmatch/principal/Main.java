package br.com.alura.screenmatch.principal;
import java.util.ArrayList;
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Zootopia 2", 2016);    
        meuFilme.setDuracaoEmMinutos(108);
       
        

        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        
        System.out.println("A média das avaliações é: "+ meuFilme.ObterMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.exibirFichaTecnica();
        lost.setTemporadas(7);
        lost.setEpisodiosPorTemporada(10);
        
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(lost);
        calculadora.inclui(meuFilme);
        System.out.println("Tempo total de reprodução: " + calculadora.getTempoTotal() + " minutos");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNome("Pilot");
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(150);
        filtro.filtra(episodio);

        var FilmeDoPaulo = new Filme( "Dogville", 2003);     
        FilmeDoPaulo.setDuracaoEmMinutos(200);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(FilmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        System.out.println(listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());
    }   
}
