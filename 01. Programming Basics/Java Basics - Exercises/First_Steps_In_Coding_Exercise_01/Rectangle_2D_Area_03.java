package First_Steps_In_Coding_Exercise_01;

import java.util.Scanner;

public class Rectangle_2D_Area_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double sideA = Math.max(x1, x2) - Math.min(x1, x2);
        double sideB = Math.max(y1, y2) - Math.min(y1, y2);
        System.out.printf("%.2f", sideA * sideB);
        System.out.println();
        System.out.printf("%.2f", 2*(sideA + sideB));
    }
}
