package program;

public class Product {
    public void initProduct(int num1, int num2) {
        product(num1, num2, 0);
    }

    public static void product(int num1, int num2, int result) {
        if (num2 <= 0) {
            System.out.println(result);
            return;
        }
        if (result == 0) {
            System.out.print("\nP(" + num1 + ", " + num2 + ") = ");
        } else {
            System.out.print(result + ", ");
        }
        /*
         * subtrai um do segundo valor, para fazer a contagem
         * o resultado é uma soma e armazenamento do própio resultado mais o primeiro valor 
         */
        product(num1, num2 - 1, result + num1);
    }
}