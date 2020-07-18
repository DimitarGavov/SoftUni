package While_Loop_Lab_05;

import java.util.Scanner;

public class Account_Balance_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        String input = "";

        while (!"NoMoreMoney".equals(input = scanner.nextLine())) {
            double number = Double.parseDouble(input);
            if (number < 0) {
                System.out.println("Invalid operation!");
                break;
            } else {
                System.out.printf("Increase: %.2f%n", number);
                total += number;
            }
        }

        System.out.printf("Total: %.2f", total);
    }
}
