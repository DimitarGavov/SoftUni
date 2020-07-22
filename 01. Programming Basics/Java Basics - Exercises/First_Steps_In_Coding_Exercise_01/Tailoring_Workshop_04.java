package First_Steps_In_Coding_Exercise_01;

import java.util.Scanner;

public class Tailoring_Workshop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countTables = Integer.parseInt(scanner.nextLine());
        double l1 = Double.parseDouble(scanner.nextLine());
        double l2 = Double.parseDouble(scanner.nextLine());

        double q1 = countTables * (l1 + 2 * 0.3) * (l2 + 2 * 0.3);
        double q2 = countTables * (l1 / 2) * (l1 / 2);

        double dollars = q1 * 7 + q2 * 9;
        double lev = dollars * 1.85;

        System.out.printf("%.2f USD%n", dollars);
        System.out.printf("%.2f BGNN%n", lev);
    }
}
