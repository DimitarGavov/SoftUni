package Arrays_More_Exercise_03;

import java.util.Arrays;
import java.util.Scanner;

public class Longest_Increasing_Subsequence_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arrayOfNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int size = 1;
        int[] len = new int[arrayOfNumbers.length];

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            for (int j = i; j < arrayOfNumbers.length; j++) {
                if (arrayOfNumbers[i] < arrayOfNumbers[j]) {
                    size++;
                    arrayOfNumbers[i] = arrayOfNumbers[j];
                }
                len[i] = size;
                size = 1;
            }
            for (int j = 0; j < arrayOfNumbers.length; j++) {
                System.out.print(len[j] + " ");
            }
            System.out.println();
        }
    }
}
