public class Main {
    public static void main(String[] args) throws Exception {
       // declarando um objeto da classe Televisão, instanciando um objeto
        Televisao televisao001 = new Televisao();
        televisao001.marca = "Samsung";
        televisao001.smartTV = true;
        televisao001.tamanhoTela = 43;
        televisao001.resolucaoTela = "Full HD";
            
        System.out.format("A marca da televisão é %s, ela possui %d polegadas, é do tipo Smart com conectivdade a Google TV e WI-FI %b, com uma resolução %s ",televisao001.marca,televisao001.tamanhoTela,televisao001.smartTV,televisao001.resolucaoTela);   
    }
}