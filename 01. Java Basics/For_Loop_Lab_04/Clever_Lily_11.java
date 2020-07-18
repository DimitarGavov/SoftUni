package For_Loop_Lab_04;

import java.util.Scanner;

public class Clever_Lily_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int money = 10;
        int t = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += money;
                money += 10;
            } else {
                t++;
            }
        }

        sum += t * p - n / 2;

        if (sum >= x) {
            System.out.printf("Yes! %.2f", sum - x);
        } else {
            System.out.printf("No! %.2f", x - sum);
        }
    }
}
