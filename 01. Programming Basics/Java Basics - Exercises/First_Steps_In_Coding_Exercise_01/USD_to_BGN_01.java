package First_Steps_In_Coding_Exercise_01;

import java.util.Scanner;

public class USD_to_BGN_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double usd = Double.parseDouble(scanner.nextLine());

        double bgn = usd * 1.79549;

        System.out.printf("%.2f", bgn);
    }
}
