package Basic_Syntax_Conditional_Statements_and_Loops_Exercise_01;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pass = scanner.nextLine();
        StringBuilder sb = new StringBuilder(pass);
        String reverse = sb.reverse().toString();
        int block = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals(reverse)) {
                System.out.printf("User %s logged in.", pass);
                break;
            } else if (block == 3) {
                System.out.printf("User %s blocked!", pass);
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
                block++;
            }
        }
    }
}
