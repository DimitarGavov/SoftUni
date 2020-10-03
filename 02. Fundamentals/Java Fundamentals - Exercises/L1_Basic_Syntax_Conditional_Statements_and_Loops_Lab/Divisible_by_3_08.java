package Basic_Syntax_Conditional_Statements_and_Loops_Lab_01;

import java.util.Scanner;

public class Divisible_by_3_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 3; i <= 99; i += 3) {
            System.out.println(i);
        }
    }
}