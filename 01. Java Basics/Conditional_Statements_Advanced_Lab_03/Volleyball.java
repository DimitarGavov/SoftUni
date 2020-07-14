package Conditional_Statements_Advanced_Lab_03;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        if (year.equalsIgnoreCase("leap")) {
            double a = (48 - h)*3.0/4.0;
            double b = p * 2.0/3.0;
            double lYear = ((a + b + h)*0.15);
            double games = a+b+lYear+h;
            System.out.printf("%.0f",(Math.floor(games)));
        } else if (year.equalsIgnoreCase("normal")) {
            double a = (48 - h)*3.0/4.0;
            double b = p * 2.0/3.0;
            double games = a+b+h;
            System.out.printf("%.0f",(Math.floor(games)));
        }
    }
}
