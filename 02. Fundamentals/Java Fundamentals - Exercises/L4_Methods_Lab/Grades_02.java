package Methods_Lab_04;

import java.util.Scanner;

public class Grades_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());

        gradeinwords(n);
    }

    public static void gradeinwords(double n) {
        if (n <= 2.99) {
            System.out.println("Fail");
        } else if (n <= 3.49) {
            System.out.println("Poor");
        } else if (n <= 4.49) {
            System.out.println("Good");
        } else if (n <= 5.49) {
            System.out.println("Very good");
        } else {
            System.out.println("Excellent");
        }
    }
}
