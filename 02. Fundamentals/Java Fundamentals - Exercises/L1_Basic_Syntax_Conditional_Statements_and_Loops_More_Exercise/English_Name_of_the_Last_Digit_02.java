package Basic_Syntax_Conditional_Statements_and_Loops_More_Exercise_01;

import java.util.Scanner;

public class English_Name_of_the_Last_Digit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String str_num = String.valueOf(num);
        int last_digit = Character.getNumericValue(str_num.charAt(str_num.length() - 1));
        switch (last_digit) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
        }

    }
}
