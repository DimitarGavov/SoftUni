package Basic_Syntax_Conditional_Statements_and_Loops_Lab_01;

import java.util.Scanner;

public class Back_In_30_Minutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aHour = Integer.parseInt(scanner.nextLine());
        int aMinute = Integer.parseInt(scanner.nextLine());

        int allMinute = aHour*60 + aMinute + 30;

        int newMinute = allMinute % 60;
        int newHour = allMinute / 60;

        if (newHour >= 24) {
            newHour -= 24;
        }

        System.out.printf("%d:%02d", newHour, newMinute);
    }
}
