package tv;
public class Televisao {
  // atributos para classe Televisão

  public String marca;
 public boolean smartTV;
 public String resolucaoTela;
 public int tamanhoTela;
  public boolean estaLigada = true;
public void mostrarStatus(){
      System.out.format("A marca da Tv é %s,com uma resolução %s, com %d polegadas, sendo Smart TV %b\n",marca, resolucaoTela, tamanhoTela, smartTV);

}

public void ligar(){
    if(estaLigada == true){

     System.out.format("A Tv está ligada: %b\n", estaLigada);
    }else{

      System.out.format("A Tv está desligada %b \n", estaLigada);
    }

}
}