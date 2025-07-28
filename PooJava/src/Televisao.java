public class Televisao {
  // atributos para classe Televisão

 String marca;
 boolean smartTV;
 String resolucaoTela;
 int tamanhoTela;
 boolean estaLigada = true;
void mostrarStatus(){
      System.out.format("A marca da Tv é %s,com uma resolução %s, com %d polegadas, sendo Smart TV %b\n",marca, resolucaoTela, tamanhoTela, smartTV);

}

void ligar(){
    if(estaLigada == true){

     System.out.format("A Tv está ligada: %b\n", estaLigada);
    }else{

      System.out.format("A Tv está desligada %b \n", estaLigada);
    }

}
}