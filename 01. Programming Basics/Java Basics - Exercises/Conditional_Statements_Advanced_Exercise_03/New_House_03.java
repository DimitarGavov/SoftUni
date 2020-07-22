package Conditional_Statements_Advanced_Exercise_03;

import java.util.Scanner;

public class New_House_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower_type = scanner.nextLine();
        int flower_count = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double flower_price = 0;
        double discount = 1;

        switch (flower_type) {
            case "Roses":
                flower_price = 5;
                if (flower_count > 80) {
                    discount = 0.9;
                }
                break;
            case "Dahlias":
                flower_price = 3.8;
                if (flower_count > 90) {
                    discount = 0.85;
                }
                break;
            case "Tulips":
                flower_price = 2.8;
                if (flower_count > 80) {
                    discount = 0.85;
                }
                break;
            case "Narcissus":
                flower_price = 3;
                if (flower_count < 120) {
                    discount = 1.15;
                }
                break;
            case "Gladiolus":
                flower_price = 2.5;
                if (flower_count < 80) {
                    discount = 1.2;
                }
                break;
        }

        double flower_budget = flower_price * flower_count * discount;

        double diff = Math.abs(flower_budget - budget);

        if (budget >= flower_budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flower_count, flower_type, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}
