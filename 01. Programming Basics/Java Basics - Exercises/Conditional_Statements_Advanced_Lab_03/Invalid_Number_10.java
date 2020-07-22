package Conditional_Statements_Advanced_Lab_03;

import java.util.Scanner;

public class Invalid_Number_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (number <0 || (number >0 && number < 100) || number > 200) {
            System.out.println("invalid");
        }
    }
}
