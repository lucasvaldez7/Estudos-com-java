package br.com.alura.screenmatch.service;
import br.com.alura.screenmatch.model.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;


    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo Titulo){
        this.tempoTotal += Titulo.getDuracaoEmMinutos();

    }
}
   