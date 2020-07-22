package Conditional_Statements_Advanced_Exercise_03;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        if (projection.equalsIgnoreCase("premiere")) {
            price = 12.0;
        } else if (projection.equalsIgnoreCase("normal")) {
            price = 7.5;
        } else if (projection.equalsIgnoreCase("discount")) {
            price = 5.0;
        }
        if (price == 0) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f leva", price * r * c);
        }
    }
}
