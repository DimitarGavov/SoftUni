package First_Steps_In_Coding_Exercise_01;

import java.util.Scanner;

public class Charity_Campaign_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days_of_campaign_count = Integer.parseInt(scanner.nextLine());
        int confectioners_counts = Integer.parseInt(scanner.nextLine());
        int cakes_count = Integer.parseInt(scanner.nextLine());
        int waffles_count = Integer.parseInt(scanner.nextLine());
        int pancakes_count = Integer.parseInt(scanner.nextLine());

        int cakes_per_day = cakes_count * 45;
        double waffles_per_day = waffles_count * 5.8;
        double pancakes_per_day = pancakes_count * 3.2;

        double money_per_day = (cakes_per_day + waffles_per_day + pancakes_per_day) * confectioners_counts;
        double all_money = money_per_day * days_of_campaign_count;
        double money_after_expenses = all_money * 7/8;

        System.out.printf("%.2f", money_after_expenses);
    }
}
