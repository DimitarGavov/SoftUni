package Arrays_Lab_03;

import java.util.Arrays;
import java.util.Scanner;

public class Condense_Array_to_Number_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < numbers.length; j++) {
                if (j + 1 < numbers.length) {
                    numbers[j] += numbers[j + 1];
                }
            }
        }
        System.out.println(numbers[0]);
    }
}
