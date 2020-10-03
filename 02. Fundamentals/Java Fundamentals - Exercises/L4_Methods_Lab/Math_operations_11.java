package Methods_Lab_04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Math_operations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(calculate(a, operator, b)));
    }

    private static double calculate(int a, String operator, int b) {
        double result = 0.0;

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a * 1.0 / b;
                break;
        }
        return result;
    }
}
