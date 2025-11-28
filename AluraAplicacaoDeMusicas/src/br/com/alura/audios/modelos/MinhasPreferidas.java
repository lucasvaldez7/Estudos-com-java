package br.com.alura.audios.modelos;

public class MinhasPreferidas {
            public void inclui (Audio audio){

                if (audio.getClassificacao() >=9){
                    System.out.println("é considerado sucesso absoluto " + audio.getTitulo());
                } else {
                    System.out.println( audio.getTitulo()+  " também é um dos que todo mundo gosta");
                }
            }
}
