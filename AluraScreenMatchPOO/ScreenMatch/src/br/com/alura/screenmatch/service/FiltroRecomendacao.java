package br.com.alura.screenmatch.service;

public class FiltroRecomendacao {
        private String recomendacao;
        public void filtra(Classificavel classificavel) {
            if (classificavel.getClassificacao() >= 4) {
                recomendacao = "Está entre os preferidos do momento!";
            } else if (classificavel.getClassificacao() >= 2) {
                recomendacao = "Vale a pena assistir.";
            } else {
                recomendacao = "Talvez você não goste muito.";
            }
            System.out.println(recomendacao);
        }
}
