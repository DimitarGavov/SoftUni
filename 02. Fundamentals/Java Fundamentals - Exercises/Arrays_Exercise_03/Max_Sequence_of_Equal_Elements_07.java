package Arrays_Exercise_03;

import java.util.Arrays;
import java.util.Scanner;

public class Max_Sequence_of_Equal_Elements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int start = 0;
        int count = 0;
        int max = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i+1]) {
                count++;
                if (count > max) {
                    start = i - count;
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        for (int i = start + 1; i <= start + max + 1; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
