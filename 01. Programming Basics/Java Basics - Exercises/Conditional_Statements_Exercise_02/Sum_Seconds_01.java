package Conditional_Statements_Exercise_02;

import java.util.Scanner;

public class Sum_Seconds_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int time1 = Integer.parseInt(scanner.nextLine());
        int time2 = Integer.parseInt(scanner.nextLine());
        int time3 = Integer.parseInt(scanner.nextLine());

        int total_time = time1 + time2 + time3;

        int minutes = total_time / 60;
        int seconds = total_time % 60;

        System.out.printf("%d:%02d", minutes, seconds);
    }
}
