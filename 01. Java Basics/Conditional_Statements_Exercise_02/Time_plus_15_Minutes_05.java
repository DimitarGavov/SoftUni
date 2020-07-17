package Conditional_Statements_Exercise_02;

import java.util.Scanner;

public class Time_plus_15_Minutes_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int min_plus15 = min + 15;
        int hours_extra = (hours + (min_plus15 / 60)) % 24;
        int min_extra = min_plus15 % 60;

        System.out.printf("%d:%02d", hours_extra, min_extra);
    }
}
