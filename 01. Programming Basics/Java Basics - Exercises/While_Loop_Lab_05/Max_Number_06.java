package While_Loop_Lab_05;

import java.util.Scanner;

public class Max_Number_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        int max = Integer.MIN_VALUE;

        while (!"Stop".equals(input = scanner.nextLine())) {
            int num = Integer.parseInt(input);

            if (num > max) {
                max = num;
            }
        }

        System.out.println(max);
    }
}
