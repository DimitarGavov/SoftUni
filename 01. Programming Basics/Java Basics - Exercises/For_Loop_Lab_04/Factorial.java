package For_Loop_Lab_04;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int factorial = 1;

        while (a > 0) {
            factorial *= a;
            a--;
        }
        System.out.println(factorial);
    }
}
