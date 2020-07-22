package For_Loop_Lab_04;

import java.util.Scanner;

public class Number_sequence_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }

        System.out.printf("Max number: %d", max);
        System.out.println();
        System.out.printf("Min number: %d", min);
    }
}
