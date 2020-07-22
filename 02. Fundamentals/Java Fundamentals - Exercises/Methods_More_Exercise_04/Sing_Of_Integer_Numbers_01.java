package Methods_More_Exercise_04;

import java.util.Scanner;

public class Sing_Of_Integer_Numbers_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = "";
        while ("Stop".equals(command = sc.nextLine())) {
            int number = Integer.parseInt(command);
            numberSign(number);
        }
        System.out.println("Thank you!");
    }

    public static void numberSign(int number) {
        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else if (number < 0) {
            System.out.println("The number " + number + " is negative.");
        } else {
            System.out.println("The number " + number + " is zero.");
        }
    }
}
