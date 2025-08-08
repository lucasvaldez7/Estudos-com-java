
public class ContaNetflix {
         private String idiomaPreferencial; // atributo idioma
         private String resolucaoTela; // atributo resolução
        
public void entrar(){
        buscarPreferenciasDoUsuario(); //define o valor do atributo idioma
        identificarResolucao(); // define o valor do atributo resolucaoTela    

}
private void buscarPreferenciasDoUsuario(){
    idiomaPreferencial = "PT-BR";

}

private void identificarResolucao(){
        resolucaoTela = "Full HD";


}


public void assistirFilme(String nomeFilme){
        System.out.println("Assistindo Filme: " + nomeFilme);
        System.out.println("Carregando na resolução: "+ resolucaoTela);
        carregarAudioFilme();
}      

private void carregarAudioFilme(){
        if (idiomaPreferencial == "PT-BR"  || idiomaPreferencial == "EN-US" ){

            System.out.println("Carregando o aúdio em: "+ idiomaPreferencial);
         }
         else{
            System.out.println("Carregando o aúdio em: PT-BR");

         }

}

}
