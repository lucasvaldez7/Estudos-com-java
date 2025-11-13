import br.com.alura.screenmatch.modelos.Filme;

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
    }   
}
