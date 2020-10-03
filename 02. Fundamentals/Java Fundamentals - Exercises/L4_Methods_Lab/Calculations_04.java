package Methods_Lab_04;

import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        Calculations(command, num1, num2);
    }

    private static void Calculations(String command, int num1, int num2) {
        if (command.equals("add")) {
            addMethod(num1, num2);
        } else if (command.equals("multiply")) {
            multiMethod(num1, num2);
        } else if (command.equals("subtract")) {
            subtractMethod(num1, num2);
        } else {
            divideMethod(num1, num2);
        }
    }

    private static void divideMethod(int num1, int num2) {
        System.out.println(num1 / num2);
    }

    private static void subtractMethod(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    private static void multiMethod(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    private static void addMethod(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}
