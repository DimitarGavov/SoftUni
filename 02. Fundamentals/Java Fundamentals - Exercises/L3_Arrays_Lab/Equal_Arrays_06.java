package Arrays_Lab_03;

import java.util.Arrays;
import java.util.Scanner;

public class Equal_Arrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] first_Array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] second_Array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;

        for (int i = 0; i < first_Array.length; i++) {
            sum += first_Array[i];
            if (first_Array[i] != second_Array[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                return;
            }
        }
        System.out.printf("Arrays are identical. Sum: %d", sum);
    }
}
