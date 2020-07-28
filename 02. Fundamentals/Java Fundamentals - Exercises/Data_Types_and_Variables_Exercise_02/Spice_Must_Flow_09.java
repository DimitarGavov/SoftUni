package Data_Types_and_Variables_Exercise_02;

import java.util.Scanner;

public class Spice_Must_Flow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int total_yield = 0;

        while (num >= 100) {
            days++;
            total_yield += num - 26;
            num -= 10;
        }
        if (days > 0) {
            total_yield -= 26;
        }

        System.out.println(days);
        System.out.println(total_yield);
    }
}
