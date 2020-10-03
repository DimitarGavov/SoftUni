package Methods_Lab_04;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String order = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        orders(order, quantity);
    }

    private static void orders(String order, int quantity) {

        double coffee = 1.50;
        double water = 1.00;
        double coke = 1.40;
        double snacks = 2.00;

        if (order.equals("coffee")) {
            System.out.printf("%.2f",coffee * quantity);
        } else if (order.equals("water")) {
            System.out.printf("%.2f",water * quantity);
        } else if (order.equals("coke")) {
            System.out.printf("%.2f",coke * quantity);
        } else {
            System.out.printf("%.2f",snacks * quantity);
        }
    }
}
