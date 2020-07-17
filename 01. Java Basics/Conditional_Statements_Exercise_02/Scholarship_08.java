package Conditional_Statements_Exercise_02;

import java.util.Scanner;

public class Scholarship_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        double avrg_score = Double.parseDouble(scanner.nextLine());
        double min_weage = Double.parseDouble(scanner.nextLine());

        double score_money1 = 0;
        double score_money2 = 0;

        if (avrg_score <= 4.5 || (avrg_score < 5.5 && min_weage <= money)) {
            System.out.println("You cannot get a scholarship!");
        } else {
            if (avrg_score >= 5.5) {
                score_money2 = Math.floor(avrg_score * 25);
            }
            if (min_weage > money) {
                score_money1 = Math.floor(min_weage * 0.35);
            }

            if (score_money1 > score_money2) {
                System.out.printf("You get a Social scholarship %.0f BGN", score_money1);
            } else {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", score_money2);
            }
        }
    }
}
