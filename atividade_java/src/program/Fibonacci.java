package program;

public class Fibonacci {
    public void initFibonacci(int count) {
        fibonacci(count, 1, 1);
    }

    public static void fibonacci(int count, int first, int second) {
        if (count == 1) {
            System.out.println(first);
            return;
        }
        System.out.print(first + ", ");
        /*
         * subtrai um da contagem
         * substitui o primeiro valor pelo segundo
         * o segundo valor passa a ser a soma do primeiro com o segundo
         */
        fibonacci(count -= 1, second, first + second);
    }
}