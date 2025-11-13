public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Zootopia 2";
        meuFilme.duracaoEmMinutos = 108;
        meuFilme.anoLancamento = 2025;     

        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(8.5);
        meuFilme.avalia(7);
        meuFilme.avalia(10);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalAvaliacao);
        System.out.println(meuFilme.ObterMedia());
    }   
}
