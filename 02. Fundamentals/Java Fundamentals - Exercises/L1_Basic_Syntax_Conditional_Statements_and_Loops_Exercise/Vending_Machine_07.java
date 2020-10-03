package Basic_Syntax_Conditional_Statements_and_Loops_Exercise_01;

import java.util.Scanner;

public class Vending_Machine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        double sum = 0;

        while (!"Start".equals(input = scanner.nextLine())) {
            double coin = Double.parseDouble(input);

            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                sum += coin;
            } else {
                System.out.printf("Cannot accept %.2f%n", coin);
            }
        }
        while (!"End".equals(input = scanner.nextLine())) {
            double price = 0;

            switch (input) {
                case "Nuts": price = 2.0; break;
                case "Water": price = 0.7; break;
                case "Crisps": price = 1.5; break;
                case "Soda": price = 0.8; break;
                case "Coke": price = 1.0; break;
            }
            if (price > sum) {
                System.out.println("Sorry, not enough money");
            } else {
                if (input.equals("")) {
                    System.out.println("Invalid product");
                } else {
                    System.out.printf("Purchased %s%n", input);
                    sum -= price;
                }
            }
        }
        System.out.printf("Change: %.2f", sum);
    }
}
