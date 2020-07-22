package Basic_Syntax_Conditional_Statements_and_Loops_Lab_01;

import java.util.Scanner;

public class Sum_of_Odd_Numbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aNumber = Integer.parseInt(scanner.nextLine());
        int sumOdd = 0;
        int oddNumber = 1;

        for (int i = 1; i <= aNumber ; i++) {
            System.out.println(oddNumber);
            sumOdd += oddNumber;
            oddNumber += 2;
        }
        System.out.printf("Sum: %d",sumOdd);
    }
}
