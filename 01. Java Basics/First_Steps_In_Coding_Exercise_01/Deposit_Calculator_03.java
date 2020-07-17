package First_Steps_In_Coding_Exercise_01;

import java.util.Scanner;

public class Deposit_Calculator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposite = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double percente = Double.parseDouble(scanner.nextLine());

        double result = deposite + months * ((deposite * (percente/100)) / 12);

        System.out.printf("%.2f%n", result);
    }
}
