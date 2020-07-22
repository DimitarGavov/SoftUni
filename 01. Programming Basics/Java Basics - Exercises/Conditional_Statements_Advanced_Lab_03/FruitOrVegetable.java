package Conditional_Statements_Advanced_Lab_03;

import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String food = scanner.nextLine();

        if (food.equals("banana")
                || food.equals("apple")
                || food.equals("kiwi")
                || food.equals("cherry")
                || food.equals("lemon")
                || food.equals("grapes")) {
            System.out.println("fruit");
        } else if (food.equals("tomato")
                || food.equals("cucumber")
                || food.equals("pepper")
                || food.equals("carrot")) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
