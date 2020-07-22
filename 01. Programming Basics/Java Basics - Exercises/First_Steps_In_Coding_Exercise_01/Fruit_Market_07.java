package First_Steps_In_Coding_Exercise_01;

import java.util.Scanner;

public class Fruit_Market_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberries_price = Double.parseDouble(scanner.nextLine());
        double bananas_weight = Double.parseDouble(scanner.nextLine());
        double oranges_weight = Double.parseDouble(scanner.nextLine());
        double raspberries_weight = Double.parseDouble(scanner.nextLine());
        double strawberries_weight = Double.parseDouble(scanner.nextLine());

        double raspberries_price = strawberries_price * 0.5;
        double oranges_price = raspberries_price * 0.6;
        double bananas_price = raspberries_price * 0.2;

        double money_for_raspberries = raspberries_price * raspberries_weight;
        double money_for_oranges = oranges_price * oranges_weight;
        double money_for_bananas = bananas_price * bananas_weight;
        double money_for_strawberries = strawberries_price * strawberries_weight;

        double all_money = money_for_raspberries + money_for_oranges + money_for_bananas + money_for_strawberries;

        System.out.printf("%.2f", all_money);
    }
}
