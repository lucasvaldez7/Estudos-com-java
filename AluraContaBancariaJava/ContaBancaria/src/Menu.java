import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*************************");
        System.out.println("");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("");
        System.out.println("Nome: Lucas Valdez");
        System.out.println("Tipo conta: Corrente");
        System.out.println("Saldo inicial: R$ 1.500,00");
        System.out.println("");
        System.out.println("*************************");
        System.out.println("");


            System.out.println("Operações: ");
            System.out.println("");
            System.out.println("1. Consultar saldos");
            System.out.println("2. Receber valor");
            System.out.println("3. Transferir valor");
            System.out.println("4. Sair");
            System.out.println("");
            System.out.println("Escolha uma operação: ");

             int opcao = scanner.nextInt();
             int saldo = 1500; 
             while (opcao != 4) {
                             
            switch (opcao) {
                case 1:
                     System.out.println("Seu saldo atual é: R$ " + saldo + ",00");
                    break;
                case 2:
                    System.out.println("Digite o valor a receber: ");
                    int recebeTransferencia = scanner.nextInt();
                    saldo += recebeTransferencia;
                    System.out.println("Valor recebido com sucesso! Seu novo saldo é: R$ " + saldo + ",00");
                    break;
                case 3:
                      System.out.println("Digite o valor a transferir: ");
                      int fazTransferencia = scanner.nextInt();
                      saldo -= fazTransferencia;
                      System.out.println("Valor transferido com sucesso, seu saldo novo é: R$ " + saldo + ",00");
                default: 
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
        }
            }   
        scanner.close();    
    }
}
