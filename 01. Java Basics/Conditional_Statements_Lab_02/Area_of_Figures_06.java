package Conditional_Statements_Lab_02;

import java.util.Scanner;

public class Area_of_Figures_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();
        double num1 = Double.parseDouble(scanner.nextLine());

        if (figure.equals("square")) {
            System.out.printf("%.3f", num1 * num1);
        } else if (figure.equals("rectangle")) {
            double num2 = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", num1 * num2);
        } else if (figure.equals("circle")) {
            System.out.printf("%.3f", num1 * Math.PI * num1);
        } else {
            double num2 = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", num1*num2/2);
        }
    }
}
