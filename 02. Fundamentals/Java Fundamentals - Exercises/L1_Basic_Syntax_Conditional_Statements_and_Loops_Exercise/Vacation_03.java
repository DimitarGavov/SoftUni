package Basic_Syntax_Conditional_Statements_and_Loops_Exercise_01;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double price_per_day = 0;
        double discount = 1;

        switch (type) {
            case "Students":
                if (people >= 30) {
                    discount = 0.85;
                }
                if (day.equals("Friday")) {
                    price_per_day = 8.45;
                } else if (day.equals("Saturday")) {
                    price_per_day = 9.8;
                } else {
                    price_per_day = 10.46;
                }
                break;
            case "Business":
                if (people >= 100) {
                    people -= 10;
                }
                if (day.equals("Friday")) {
                    price_per_day = 10.9;
                } else if (day.equals("Saturday")) {
                    price_per_day = 15.6;
                } else {
                    price_per_day = 16;
                }
                break;
            case "Regular":
                if (people >= 10 && people <= 20) {
                    discount = 0.95;
                }
                if (day.equals("Friday")) {
                    price_per_day = 15;
                } else if (day.equals("Saturday")) {
                    price_per_day = 20;
                } else {
                    price_per_day = 22.5;
                }
                break;
        }

        double total_price = people * price_per_day * discount;

        System.out.printf("Total price: %.2f", total_price);
    }
}
