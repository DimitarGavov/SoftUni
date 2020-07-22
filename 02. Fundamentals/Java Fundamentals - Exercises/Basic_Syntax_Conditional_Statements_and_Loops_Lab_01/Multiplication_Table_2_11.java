package Basic_Syntax_Conditional_Statements_and_Loops_Lab_01;

import java.util.Scanner;

public class Multiplication_Table_2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aNumber = Integer.parseInt(scanner.nextLine());
        int startNumber = Integer.parseInt(scanner.nextLine());

        if (startNumber > 10 || aNumber > 10) {
            System.out.printf("%d X %d = %d", aNumber,  startNumber, aNumber*startNumber);
        } else {
            for (int i = startNumber; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", aNumber, i, aNumber*i);
            }
        }
    }
}
