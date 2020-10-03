package Basic_Syntax_Conditional_Statements_and_Loops_Lab_01;

import java.util.Scanner;

public class Passed_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double aNumber = Double.parseDouble(scanner.nextLine());

        if (aNumber >= 3.00) {
            System.out.println("Passed!");
        }
    }
}
