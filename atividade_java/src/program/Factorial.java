package program;

public class Factorial {
    public void initFactorial(int number) {
        factorial(number, 1, 1);
    }

    public static void factorial(int number, long count, long result) {
        // resultado é igual ele mesmo multiplicado pela variável contagem
        result *= count;
        if (count >= number) {
            System.out.println(count + "! = " + result);
            return;
        }
        System.out.println(count + "! = " + result);
        // Refatora, devolvendo as variáveis e adicionando um para contagem
        factorial(number, count + 1, result);
    }
}