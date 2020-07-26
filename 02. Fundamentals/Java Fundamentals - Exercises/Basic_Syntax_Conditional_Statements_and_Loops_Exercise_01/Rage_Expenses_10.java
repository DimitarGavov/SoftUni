package Basic_Syntax_Conditional_Statements_and_Loops_Exercise_01;

import java.util.Scanner;

public class Rage_Expenses_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lost_games = Integer.parseInt(scanner.nextLine());

        double sum = Double.parseDouble(scanner.nextLine()) * (lost_games / 2) +
                        Double.parseDouble(scanner.nextLine()) * (lost_games / 3) +
                        Double.parseDouble(scanner.nextLine()) * (lost_games / 6) +
                        Double.parseDouble(scanner.nextLine()) * (lost_games / 12);

        System.out.printf("Rage expenses: %.2f lv.", sum);
    }
}
