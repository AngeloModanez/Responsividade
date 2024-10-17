package program;

public class Sum {
    public void initSum(int count) {
        sum(count, 0);
    }

    public static void sum(int count, int result) {
        if (count == 1) {
            result += 1;
            System.out.println(count + " = " + result);
            return;
        }
        System.out.print(count + " + ");
        /*
         * subtrai um da contagem
         * o resultado é a soma dele com a contagem
         */
        sum(count - 1, result + count);
    }
}