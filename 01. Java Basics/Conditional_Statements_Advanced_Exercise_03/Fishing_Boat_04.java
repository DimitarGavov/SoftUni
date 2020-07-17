package Conditional_Statements_Advanced_Exercise_03;

import java.util.Scanner;

public class Fishing_Boat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        int season_price = 0;
        double discount;

        switch (season) {
            case "Spring":
                season_price = 3000;
                break;
            case "Summer":
            case "Autumn":
                season_price = 4200;
                break;
            case "Winter":
                season_price = 2600;
                break;
        }

        if (count <= 6) {
            discount = 0.9;
        } else if (count <= 11) {
            discount = 0.85;
        } else {
            discount = 0.75;
        }

        double fish_budget = season_price * discount;

        if (count % 2 == 0 && !season.equals("Autumn")) {
            fish_budget = fish_budget * 0.95;
        }

        if (fish_budget > budget) {
            System.out.printf("Not enough money! You need %.2f leva.", fish_budget - budget);
        } else {
            System.out.printf("Yes! You have %.2f leva left.", budget - fish_budget);
        }
    }
}
