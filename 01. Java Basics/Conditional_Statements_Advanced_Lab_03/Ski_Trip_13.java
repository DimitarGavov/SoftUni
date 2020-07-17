package Conditional_Statements_Advanced_Lab_03;

import java.util.Scanner;

public class Ski_Trip_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String hotel_room = scanner.nextLine();
        String grade = scanner.nextLine();

        double price_per_night = 0;
        double discount = 1;
        double grade_value = 0.9;
        double total_price = 0;

        switch (hotel_room) {
            case "room for one person":
                price_per_night = 18;
                break;
            case "apartment":
                price_per_night = 25;
                if (days < 10) {
                    discount = 0.70;
                } else if (days < 15) {
                    discount = 0.65;
                } else {
                    discount = 0.5;
                }
                break;
            case "president apartment":
                price_per_night = 35;
                if (days < 10) {
                    discount = 0.90;
                } else if (days < 15) {
                    discount = 0.85;
                } else {
                    discount = 0.8;
                }
                break;
        }

        if (grade.equals("positive")) {
            grade_value = 1.25;
        }

        total_price = price_per_night * (days -1) * discount * grade_value;

        System.out.printf("%.2f", total_price);
    }
}
