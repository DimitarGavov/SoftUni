package Basic_Syntax_Conditional_Statements_and_Loops_Lab_01;

import java.util.Scanner;

public class Refactor_Sum_of_Odd_Numbers_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int test = 0;

        while (num != 0) {
            test++;
            if (test % 2 != 0) {
                sum += test;
                System.out.println(test);
                num--;
            }
        }
        System.out.printf("Sum: %d", sum);
    }
}
