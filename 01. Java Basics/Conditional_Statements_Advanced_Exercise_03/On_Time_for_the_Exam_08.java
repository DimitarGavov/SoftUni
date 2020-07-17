package Conditional_Statements_Advanced_Exercise_03;

import java.util.Scanner;

public class On_Time_for_the_Exam_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour_exam = Integer.parseInt(scanner.nextLine());
        int minute_exam = Integer.parseInt(scanner.nextLine());
        int hour_arrive = Integer.parseInt(scanner.nextLine());
        int minute_arrive = Integer.parseInt(scanner.nextLine());

        String condition = "";

        int diff = Math.abs((hour_exam - hour_arrive) * 60 + minute_exam - minute_arrive);

        int exam_in_min = hour_exam * 60 + minute_exam;
        int arrive_in_min = hour_arrive * 60 + minute_arrive;



        if (diff < 60) {
            if (minute_exam >= minute_arrive) {
                if (minute_exam - minute_arrive > 30) {
                    condition = "Early";
                    System.out.println(condition);
                    System.out.printf("%d minutes before the start", diff);
                } else {
                    condition = "On time";
                    System.out.println(condition);
                    if (minute_exam != minute_arrive) {
                        System.out.printf("%d minutes before the start", diff);
                    }
                }
            } else {

            }
        }
    }
}
