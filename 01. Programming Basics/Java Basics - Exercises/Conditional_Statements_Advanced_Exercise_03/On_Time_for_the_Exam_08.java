package Conditional_Statements_Advanced_Exercise_03;

import java.util.Scanner;

public class On_Time_for_the_Exam_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour_exam = Integer.parseInt(scanner.nextLine());
        int minute_exam = Integer.parseInt(scanner.nextLine());
        int hour_arrive = Integer.parseInt(scanner.nextLine());
        int minute_arrive = Integer.parseInt(scanner.nextLine());

        int diff = Math.abs((hour_exam - hour_arrive) * 60 + minute_exam - minute_arrive);

        int exam_in_min = hour_exam * 60 + minute_exam;
        int arrive_in_min = hour_arrive * 60 + minute_arrive;

        if (arrive_in_min > exam_in_min) {
            System.out.println("Late");
            if (diff < 60) {
                System.out.printf("%d minutes after the start", diff);
            } else {
                System.out.printf("%d:%02d hours after the start", diff / 60, diff % 60);
            }
        } else {
            if (diff <= 30) {
                System.out.println("On time");
                if (diff != 0) {
                    System.out.printf("%d minutes before the start", diff);
                }
            } else {
                System.out.println("Early");
                if (diff < 60) {
                    System.out.printf("%d minutes before the start", diff);
                } else {
                    System.out.printf("%d:%02d hours before the start", diff / 60, diff % 60);
                }
            }
        }
    }
}
