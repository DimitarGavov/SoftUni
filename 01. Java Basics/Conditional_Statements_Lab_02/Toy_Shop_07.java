package Conditional_Statements_Lab_02;

import java.util.Scanner;

public class Toy_Shop_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price_for_trip = Double.parseDouble(scanner.nextLine());
        int puzzles_count = Integer.parseInt(scanner.nextLine());
        int talking_dolls_count = Integer.parseInt(scanner.nextLine());
        int teddy_bears_count = Integer.parseInt(scanner.nextLine());
        int minions_count = Integer.parseInt(scanner.nextLine());
        int trucks_count = Integer.parseInt(scanner.nextLine());

        double puzzle_money = puzzles_count * 2.6;
        double talking_dolls_money = talking_dolls_count * 3;
        double teddy_bears_money = teddy_bears_count * 4.1;
        double minions_money = minions_count * 8.2;
        double trucks_money = trucks_count * 2;

        double toys_money = puzzle_money + talking_dolls_money + teddy_bears_money + minions_money + trucks_money;

        if ((puzzles_count + talking_dolls_count + teddy_bears_count + minions_count + trucks_count) >= 50)  {
            toys_money = toys_money * 0.75;
        }

        toys_money = toys_money * 0.9;

        if (toys_money >= price_for_trip) {
            System.out.printf("Yes! %.2f lv left.", toys_money - price_for_trip);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", price_for_trip - toys_money);
        }
    }
}
