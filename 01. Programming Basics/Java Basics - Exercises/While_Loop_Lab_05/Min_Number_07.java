package While_Loop_Lab_05;

import java.util.Scanner;

public class Min_Number_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        int min = Integer.MAX_VALUE;

        while (!"Stop".equals(input = scanner.nextLine())) {
            int num = Integer.parseInt(input);

            if (num < min) {
                min = num;
            }
        }

        System.out.println(min);
    }
}
