package Arrays_More_Exercise_03;

import java.util.Scanner;

public class Recursive_Fibonacci_03 {

    public static long fibArray[] = new long[50];

    public static long fibonacci(long n) {
        long fibValue = 0;
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            fibValue = fibonacci(n - 1) + fibonacci(n - 2);
            fibArray[(int) n] = fibValue;
            return fibValue;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        fibArray[0] = 1;
        fibArray[1] = 1;

        System.out.println(fibonacci(n));
    }
}
