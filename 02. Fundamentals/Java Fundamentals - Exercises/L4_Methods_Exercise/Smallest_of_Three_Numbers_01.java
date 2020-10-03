package Methods_Exercise_04;

import java.util.Scanner;

public class Smallest_of_Three_Numbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        smallestofThreeNumbers(a, b, c);
    }

    private static void smallestofThreeNumbers(int a, int b, int c) {
        System.out.println(Math.min(a, Math.min(b, c)));
    }
}
