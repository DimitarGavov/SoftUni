package Conditional_Statements_Advanced_Exercise_03;

import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double money = 0;
        String location_country = "";
        String location_type = "";

        if (budget <= 100) {
            location_country = "Bulgaria";
            if (season.equals("summer")) {
                money = budget * 0.3;
                location_type = "Camp";
            } else {
                money = budget * 0.7;
                location_type = "Hotel";
            }
        } else if (budget <= 1000) {
            location_country = "Balkans";
            if (season.equals("summer")) {
                money = budget * 0.4;
                location_type = "Camp";
            } else {
                money = budget * 0.8;
                location_type = "Hotel";
            }
        } else {
            location_country = "Europe";
            location_type = "Hotel";
            money = budget * 0.9;
        }

        System.out.printf("Somewhere in %s%n%s - %.2f", location_country, location_type, money);
    }
}
