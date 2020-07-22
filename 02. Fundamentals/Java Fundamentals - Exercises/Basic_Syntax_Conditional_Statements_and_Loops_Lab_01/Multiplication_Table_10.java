package Basic_Syntax_Conditional_Statements_and_Loops_Lab_01;

import java.util.Scanner;

public class Multiplication_Table_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", aNumber, i, aNumber*i);
        }
    }
}
