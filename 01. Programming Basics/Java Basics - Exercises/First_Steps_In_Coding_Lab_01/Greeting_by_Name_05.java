package Basic_Syntax_Conditional_Statements_and_Loops_Lab_01;

import java.util.Scanner;

public class Greeting_by_Name_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
