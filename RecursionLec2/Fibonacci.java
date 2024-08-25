package RecursionLec2;

public class Fibonacci {
    static int fibonacciSeries(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);

        // sub problems
//
//        int prev = fibonacciSeries(n - 1);
//        int prevPrev = fibonacciSeries(n - 2);
//
//        return prev + prevPrev;
   }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(fibonacciSeries(i));

        }
    }
}
