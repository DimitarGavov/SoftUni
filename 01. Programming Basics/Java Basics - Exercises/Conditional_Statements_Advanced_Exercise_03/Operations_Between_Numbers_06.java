package Conditional_Statements_Advanced_Exercise_03;

import java.util.Scanner;

public class Operations_Between_Numbers_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);

        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                if (result % 2 == 0) {
                    System.out.printf("%d + %d = %d - even", num1, num2, result);
                } else {
                    System.out.printf("%d + %d = %d - odd", num1, num2, result);
                }
                break;
            case '-':
                result = num1 - num2;
                if (result % 2 == 0) {
                    System.out.printf("%d - %d = %d - even", num1, num2, result);
                } else {
                    System.out.printf("%d - %d = %d - odd", num1, num2, result);
                }
                break;
            case '*':
                result = num1 * num2;
                if (result % 2 == 0) {
                    System.out.printf("%d * %d = %d - even", num1, num2, result);
                } else {
                    System.out.printf("%d * %d = %d - odd", num1, num2, result);
                }
                break;
            case '/':
                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero", num1);
                } else {
                    System.out.printf("%d / %d = %.2f", num1, num2, num1 * 1.0 / num2);
                }
                break;
            case '%':
                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero", num1);
                } else {
                    result = num1 % num2;
                    System.out.printf("%d %% %d = %d", num1, num2, result);
                }
                break;
        }
    }
}
