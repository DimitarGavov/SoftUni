package Conditional_Statements_Advanced_Exercise_03;

import java.util.Scanner;

public class Summer_Outfit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degree = Integer.parseInt(scanner.nextLine());
        String day_label = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        if (degree >= 10 && degree <= 18) {
            switch (day_label) {
                case "Morning":
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                    break;
                case "Afternoon":
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
            }
        } else if (degree > 18 && degree <= 24) {
            switch (day_label) {
                case "Morning":
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
                case "Afternoon":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;
            }
        } else if (degree >= 25) {
            switch (day_label) {
                case "Morning":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;
                case "Afternoon":
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                    break;
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
            }
        }

        System.out.printf("It's %d degrees, get your %s and %s.", degree, outfit, shoes);
    }
}
