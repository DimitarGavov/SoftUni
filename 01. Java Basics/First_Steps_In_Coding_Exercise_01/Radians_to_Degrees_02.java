package First_Steps_In_Coding_Exercise_01;

import java.util.Scanner;

public class Radians_to_Degrees_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radians = Double.parseDouble(scanner.nextLine());

        double degrees = radians * 180 / Math.PI;

        System.out.printf("%.0f", degrees);
    }
}
