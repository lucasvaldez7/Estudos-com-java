import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*************************");   
        System.out.println("Dados iniciais do cliente: \n");     
        System.out.println("Nome: Lucas Valdez");
        System.out.println("Tipo conta: Corrente");
        System.out.println("Saldo inicial: R$ 1.500,00\n");       
        System.out.println("*************************");
           
        int opcao =0;
        int saldo = 1500; 
             
             while (opcao != 4) {

                System.out.println("1 - Consultar saldo");
                System.out.println("2 - Receber transferência");
                System.out.println("3 - Fazer transferência");
                System.out.println("4 - Sair");
                System.out.println("Escolha uma opção: ");
                opcao = scanner.nextInt();
                
                             
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
                    break;
                case 4:
                        System.out.println("Saindo do sistema. Obrigado por usar nosso serviço!");
                    break;
                default: 
                     System.out.println("Opção inválida.");
                    break;
        }
            }   
        scanner.close();    
    }
}
