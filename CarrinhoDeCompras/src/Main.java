import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
                String item;
                double precoItem;
                int quantidadeItem;

                System.out.print("Qual item você gostaria de comprar?: ");
                item = sc.nextLine();
                System.out.print("Qual o valor desse item?: ");
                 precoItem = sc.nextDouble();
                System.out.print("Quantas unidades você gostaria?: ");
                quantidadeItem = sc.nextInt();
                System.out.printf("Você comprou: %d unidade(s) de: %s por %.2f%n ",quantidadeItem,item,precoItem);

                double totalPedido = quantidadeItem * precoItem;
                    System.out.printf("Total a pagar: %.2f%n ",totalPedido);
                sc.close();
    }
}
