 package Conditional_Statements_Advanced_Lab_03;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0;

        if (dayOfWeek.equals("Saturday")
                || dayOfWeek.equals("Sunday")) {
            if (product.equals("banana")) {
                price = 2.70;
            } else if (product.equals("apple")) {
                price = 1.25;
            } else if (product.equals("orange")) {
                price = 0.90;
            } else if (product.equals("grapefruit")) {
                price = 1.60;
            } else if (product.equals("kiwi")) {
                price = 3.00;
            } else if (product.equals("pineapple")) {
                price = 5.60;
            } else if (product.equals("grapes")) {
                price = 4.20;
            }
        } else if (dayOfWeek.equals("Monday")
                || dayOfWeek.equals("Tuesday")
                || dayOfWeek.equals("Wednesday")
                || dayOfWeek.equals("Thursday")
                || dayOfWeek.equals("Friday")){
            if (product.equals("banana")) {
                price = 2.50;
            } else if (product.equals("apple")) {
                price = 1.20;
            } else if (product.equals("orange")) {
                price = 0.85;
            } else if (product.equals("grapefruit")) {
                price = 1.45;
            } else if (product.equals("kiwi")) {
                price = 2.70;
            } else if (product.equals("pineapple")) {
                price = 5.50;
            } else if (product.equals("grapes")) {
                price = 3.85;
            }
        }
        if (price == 0) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f",price * quantity);
        }
    }
}
