package main;

import program.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        Fibonacci fibonacci = new Fibonacci();
        Product product = new Product();
        Sum sum = new Sum();

        Scanner in = new Scanner(System.in);

        try {
            while (true) {
                System.out.print(
                        "\n+-+-+-+-+-+-+-+-+" +
                        "\n| Funções:      |" +
                        "\n| 1 > Factorial |" +
                        "\n| 2 > Fibonacci |" +
                        "\n| 3 > Produto   |" +
                        "\n| 4 > Soma      |" +
                        "\n+-+-+-+-+-+-+-+-+" +
                        "\n»»» ");
                int choice = in.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("\nDigite o número  para calcular o fatorial: ");
                        int fac = in.nextInt();
                        factorial.initFactorial(fac);
                        break;
                    case 2:
                        System.out.print("\nInforme uma sequência desejada: ");
                        int fib = in.nextInt();
                        fibonacci.initFibonacci(fib);
                        break;
                    case 3:
                        System.out.print("\nDigite o primeiro valor: ");
                        int num1 = in.nextInt();
                        System.out.print("Digite o segundo valor: ");
                        int num2 = in.nextInt();
                        product.initProduct(num1, num2);
                        break;
                    case 4:
                        System.out.print("\nInforme o valor da soma: ");
                        int s = in.nextInt();
                        sum.initSum(s);
                        break;
                    default:
                        System.out.println("\nOpção " + choice + " é inexistente...");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("\nTipo de Valor inválido...");
            in.close();
        }
    }
}