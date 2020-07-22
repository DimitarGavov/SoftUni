package While_Loop_Exercise_05;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double needed_money_for_trip = Double.parseDouble(scanner.nextLine());
        double available_money = Double.parseDouble(scanner.nextLine());
        int spend_count = 0;
        int total_days = 0;

        while (!(spend_count == 5)) {
            String input = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            total_days++;
            if (input.equals("spend")) {
                spend_count++;
                available_money -= money;
                if (available_money < 0) {
                    available_money = 0;
                }
            } else {
                spend_count = 0;
                available_money += money;
            }

            if (needed_money_for_trip <= available_money) {
                System.out.printf("You saved the money for %d days.", total_days);
                break;
            }

            if (spend_count == 5) {
                System.out.printf("You can't save the money.%n%d", total_days);
            }
        }
    }
}
