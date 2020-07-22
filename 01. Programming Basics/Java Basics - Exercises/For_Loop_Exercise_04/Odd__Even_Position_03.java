package For_Loop_Exercise_04;

import java.util.Scanner;

public class Odd__Even_Position_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double oddSum = 0;
        double oddMin = Double.MAX_VALUE;
        double oddMax = -Double.MAX_VALUE;
        double evenSum = 0;
        double evenMin = Double.MAX_VALUE;
        double evenMax = -Double.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 1) {
                if (oddMin > num) oddMin = num;
                if (oddMax < num) oddMax = num;
                oddSum += num;
            } else {
                evenSum += num;
                if (evenMin > num) evenMin = num;
                if (evenMax < num) evenMax = num;
            }
        }

        System.out.printf("OddSum=%.2f,\n", oddSum);

        if (oddMin == Double.MAX_VALUE) {
            System.out.println("OddMin=No,");
        } else {
            System.out.printf("OddMin=%.2f,\n", oddMin);
        }

        if (oddMax == -Double.MAX_VALUE) {
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMax=%.2f,\n", oddMax);
        }

        System.out.printf("EvenSum=%.2f,\n", evenSum);

        if (evenMin == Double.MAX_VALUE) {
            System.out.println("EvenMin=No,");
        } else {
            System.out.printf("EvenMin=%.2f,\n", evenMin);
        }

        if (evenMax == -Double.MAX_VALUE) {
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMax=%.2f", evenMax);
        }

    }
}
