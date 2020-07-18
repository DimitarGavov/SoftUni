package OLD_Simple_Operations_and_Calculations_Lab_01;

import java.util.Scanner;

public class NumberInRange1To100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Еnter a number in the range [1...100]:");
        int n = Integer.parseInt(scanner.nextLine());

        while (n < 1 || n > 100) {
            System.out.println("Invalid number!");
            System.out.println("Еnter a number in the range [1...100]:");
            n = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("The number is: " + n);
    }
}
