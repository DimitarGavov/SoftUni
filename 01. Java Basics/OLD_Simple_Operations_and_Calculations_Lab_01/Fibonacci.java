package OLD_Simple_Operations_and_Calculations_Lab_01;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter even number:");
        int fib = Integer.parseInt(scanner.nextLine());

        int fib0 = 1;
        int fib1 = 1;

        while (fib > 1) {

            int sum = fib0 + fib1;
            fib0 = fib1;
            fib1 = sum;
            fib--;
        }
        System.out.println(fib1);
    }
}
