import tv.*;

public class Main {
    public static void main(String[] args) throws Exception {
       // declarando um objeto da classe Televisão, instanciando um objeto
        Televisao televisao001 = new Televisao();
        televisao001.marca = "Samsung";
        televisao001.smartTV = true;
        televisao001.tamanhoTela = 43;
        televisao001.resolucaoTela = "Full HD";

          //método para mostrar as informações da TV      
        televisao001.mostrarStatus();
        //método para ligar a TV
        televisao001.ligar();
    }
}