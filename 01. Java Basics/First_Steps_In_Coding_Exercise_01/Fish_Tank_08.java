package First_Steps_In_Coding_Exercise_01;

import java.util.Scanner;

public class Fish_Tank_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double precSand = Double.parseDouble(scanner.nextLine());

        double volumeFishTank = (a * b * c) * 0.001;

        double precSand2 = 1 - (precSand * 0.01);

        double result = volumeFishTank * precSand2;

        System.out.printf("%.3f", result);
    }
}
