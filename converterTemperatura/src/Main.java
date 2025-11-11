import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite qual a temperatura em Cº: ");
    double temperatura = sc.nextDouble();
    System.out.println("A temperatura em Celsius é: " + temperatura);
    temperatura = (temperatura * 1.8) + 32;
    System.out.println("Convertendo para Fahrenheit fica: " + temperatura);


}