package Basic_Syntax_Conditional_Statements_and_Loops_More_Exercise_01;

import java.util.Scanner;

public class Gaming_Store_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double current_balance = Double.parseDouble(scanner.nextLine());

        double total_price = 0;
        String game = "";

        while (!"Game Time".equals(game = scanner.nextLine())) {
            double current_price = switch (game) {
                case "OutFall 4", "RoverWatch Origins Edition" -> 39.99;
                case "CS: OG" -> 15.99;
                case "Zplinter Zell" -> 19.99;
                case "Honored 2" -> 59.99;
                case "RoverWatch" -> 29.99;
                default -> 0;
            };

            if (current_price == 0) {
                System.out.println("Not Found");
            } else if (current_balance - current_price > 0) {
                System.out.printf("Bought %s%n", game);
                total_price += current_price;
                current_balance -= current_price;
            } else if (current_balance - current_price == 0) {
                System.out.println("Out of money!");
                break;
            } else {
                System.out.println("Too Expensive");
            }
        }
        if (current_balance != 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", total_price, current_balance);
        }
    }
}
