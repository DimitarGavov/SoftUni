package Arrays_More_Exercise_03;

import java.util.Arrays;
import java.util.Scanner;

public class Longest_Increasing_Subsequence_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arrayOfNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxLength = 0;
        int lastIndex = -1;

        int[] len = new int[arrayOfNumbers.length];
        int[] helper = new int[arrayOfNumbers.length];

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            len[i] = 1;
            helper[i] = -1;

            for (int j = 0; j < i; j++) {
                if (arrayOfNumbers[i] > arrayOfNumbers[j] && len[j] + 1 > len[i]) {
                    len[i] = len[j] + 1;
                    helper[i] = j;
                }
            }
            if (len[i] > maxLength) {
                maxLength = len[i];
                lastIndex = i;
            }
        }

        int[] result = new int[maxLength];
        int currentIndex = maxLength - 1;

        while (lastIndex != -1) {
            result[currentIndex] = arrayOfNumbers[lastIndex];
            currentIndex--;
            lastIndex = helper[lastIndex];
        }

        for (int j = 0; j < result.length; j++) {
            System.out.print(result[j] + " ");
        }
    }
}
