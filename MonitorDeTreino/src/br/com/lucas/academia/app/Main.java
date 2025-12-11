package br.com.lucas.academia.app;

import br.com.lucas.academia.model.Exercicio;
import br.com.lucas.academia.model.Treino;

public class Main{
    public static void main(String[] args) {
            Treino treinoA = new Treino("A - Costas e Bíceps");

            treinoA.adicionarExercicios(new Exercicio("Lat Pulldown",40));
            treinoA.adicionarExercicios(new Exercicio("Remada Curvada com barra ",44));
            treinoA.adicionarExercicios(new Exercicio("Puxada Máquina",40));
            treinoA.adicionarExercicios(new Exercicio("Rosca 45º ",12));
            treinoA.adicionarExercicios(new Exercicio("Banco Scoot",25));

            Treino treinoB = new Treino("B - Peito, Tríceps e Costas");

            treinoB.adicionarExercicios(new Exercicio("Supino Inclinado",20));
            treinoB.adicionarExercicios(new Exercicio("Crucifixo Máquina",45));
            treinoB.adicionarExercicios(new Exercicio("Tríceps polia alta",25));
            treinoB.adicionarExercicios(new Exercicio("Tríceps francês na polia",20));
            treinoB.adicionarExercicios(new Exercicio("Desenvolvimento com Halter ",14));
            treinoB.adicionarExercicios(new Exercicio("Elevação Lateral com Halter ",10));

            Treino treinoC = new Treino("C - Quadríceps");

            treinoC.adicionarExercicios(new Exercicio("Agachamento Smith",40));
            treinoC.adicionarExercicios(new Exercicio("Leg Press 45º",100));
            treinoC.adicionarExercicios(new Exercicio("Cadeira Extensora",85));
            treinoC.adicionarExercicios(new Exercicio("Cadeira Flexora",70));
            treinoC.adicionarExercicios(new Exercicio("Panturrilha Sentado",50));

            Treino treinoD = new Treino("D - Upper");

            treinoD.adicionarExercicios(new Exercicio("Supino Máquina",70));
            treinoD.adicionarExercicios(new Exercicio("Rosca Martelo com halter",12));
            treinoD.adicionarExercicios(new Exercicio("Tríceps Testa Polia",30));
            treinoD.adicionarExercicios(new Exercicio("Puxada Máquina",40));
            treinoD.adicionarExercicios(new Exercicio("Desenvolvimento com Halateres",14));

            Treino treinoE = new Treino("E - Posterior");

            treinoE.adicionarExercicios(new Exercicio("Cadeira Flexora",70));
            treinoE.adicionarExercicios(new Exercicio("Máquina Flexão de Joelhos",20));
            treinoE.adicionarExercicios(new Exercicio("Stiff com barra",60));
            treinoE.adicionarExercicios(new Exercicio("Cadeira Extensora",85));
            treinoE.adicionarExercicios(new Exercicio("Panturrilha Sentado",50));

            treinoA.listarExercicios();
            treinoB.listarExercicios();
            treinoC.listarExercicios();
            treinoD.listarExercicios();
            treinoE.listarExercicios();
    }


}
