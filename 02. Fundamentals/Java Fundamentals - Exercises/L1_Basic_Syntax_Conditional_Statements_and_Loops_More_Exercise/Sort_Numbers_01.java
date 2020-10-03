package Basic_Syntax_Conditional_Statements_and_Loops_More_Exercise_01;

import java.util.Scanner;

public class Sort_Numbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int max = Math.max(Math.max(num1, num2), num3);
        int min = Math.min(Math.min(num1, num2), num3);
        int middle = num1 + num2 + num3 - min - max;

        System.out.println(max);
        System.out.println(middle);
        System.out.println(min);
    }
}
