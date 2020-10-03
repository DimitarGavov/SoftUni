package Methods_Lab_04;

import java.util.Scanner;

public class Calculate_Rectangle_Area_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.0f", rectangleCalculation(a, b));
    }

    private static double rectangleCalculation(double a, double b) {return a * b;}
}
