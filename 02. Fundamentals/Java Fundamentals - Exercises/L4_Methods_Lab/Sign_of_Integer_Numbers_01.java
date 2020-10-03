package Methods_Lab_04;

import java.util.Scanner;

public class Sign_of_Integer_Numbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        SignMethod(n);
    }

    private static void SignMethod(int n) {
        if (n > 0) {
            System.out.println("The number " + n + " is positive.");
        } else if (n < 0) {
            System.out.println("The number " + n + " is negative.");
        } else {
            System.out.println("The number " + n + " is zero.");
        }
    }
}
