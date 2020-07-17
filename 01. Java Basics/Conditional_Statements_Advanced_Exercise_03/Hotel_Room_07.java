package Conditional_Statements_Advanced_Exercise_03;

import java.util.Scanner;

public class Hotel_Room_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights_count = Integer.parseInt(scanner.nextLine());

        double studio_price = 0;
        double apartment_price = 0;
        double discount_studio = 1;
        double discount_apartment = 1;

        switch (month) {
            case "May":
            case "October":
                studio_price = 50;
                apartment_price = 65;
                if (nights_count > 7) {
                    discount_studio = 0.95;
                }
                if (nights_count > 14) {
                    discount_studio = 0.7;
                }
                break;
            case "June":
            case "September":
                studio_price = 75.20;
                apartment_price = 68.70;
                if (nights_count > 14) {
                    discount_studio = 0.8;
                }
                break;
            case "July":
            case "August":
                studio_price = 76;
                apartment_price = 77;
                break;
        }

        if (nights_count > 14) {
            discount_apartment = 0.9;
        }

        System.out.printf("Apartment: %.2f lv.", nights_count * apartment_price * discount_apartment);
        System.out.println();
        System.out.printf("Studio: %.2f lv.", nights_count * studio_price * discount_studio);
    }
}
