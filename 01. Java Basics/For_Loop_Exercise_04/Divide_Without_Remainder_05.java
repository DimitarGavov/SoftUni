package For_Loop_Exercise_04;

import java.util.Scanner;

public class Divide_Without_Remainder_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num % 2 == 0) count2++;
            if (num % 3 == 0) count3++;
            if (num % 4 == 0) count4++;
        }

        double percent2 = count2 * 1.0 / n * 100;
        double percent3 = count3 * 1.0 / n * 100;
        double percent4 = count4 * 1.0 / n * 100;

        System.out.printf("%.2f%%%n", percent2);
        System.out.printf("%.2f%%%n", percent3);
        System.out.printf("%.2f%%", percent4);
    }
}
