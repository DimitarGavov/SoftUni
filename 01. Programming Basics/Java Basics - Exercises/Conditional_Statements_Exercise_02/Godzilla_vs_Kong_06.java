package Conditional_Statements_Exercise_02;

import java.util.Scanner;

public class Godzilla_vs_Kong_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double price_per_extras = Double.parseDouble(scanner.nextLine());
        double discount = 1;

        if (extras > 150) {
            discount = 0.9;
        }

        double decor = budget * 0.1;
        double clothes = extras * price_per_extras * discount;
        double total_price = decor + clothes;
        double diff_price = Math.abs(budget - total_price);

        if (total_price <= budget) {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", diff_price);
        } else {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", diff_price);
        }
    }
}
