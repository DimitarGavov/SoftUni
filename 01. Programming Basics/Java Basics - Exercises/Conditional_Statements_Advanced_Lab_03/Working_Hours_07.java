package Conditional_Statements_Advanced_Lab_03;

import java.util.Scanner;

public class Working_Hours_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        if (day.equals("Sunday") || (hour < 10 || hour >= 18)) {
            System.out.println("closed");
        } else {
            System.out.println("open");
        }
    }
}
