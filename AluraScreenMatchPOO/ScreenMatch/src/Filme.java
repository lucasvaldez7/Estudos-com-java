public class Filme {
    String nome;
    int anoLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalAvaliacao;
    int duracaoEmMinutos;

    void exibirFichaTecnica() {
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento:" + anoLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacao++;
    }

    double ObterMedia() {
        return somaDasAvaliacoes / totalAvaliacao;
    }
}
