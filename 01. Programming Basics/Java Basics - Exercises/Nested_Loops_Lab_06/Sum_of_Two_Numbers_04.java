package Nested_Loops_Lab_06;

import java.util.Scanner;

public class Sum_of_Two_Numbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start_number = Integer.parseInt(scanner.nextLine());
        int end_number = Integer.parseInt(scanner.nextLine());
        int magic_number = Integer.parseInt(scanner.nextLine());

        int n = 0;
        boolean bool = true;

        for (int i = start_number; i <= end_number; i++) {
            for (int j = start_number; j <= end_number; j++) {
                n++;
                if (i + j == magic_number) {
                    bool = false;
                    System.out.printf("Combination N:%d (%d + %d = %d)", n, i, j, i + j);
                    break;
                }
            }
            if (!bool) {
                break;
            }
        }

        if (bool) {
            System.out.printf("%d combinations - neither equals %d", n, magic_number);
        }
    }
}
