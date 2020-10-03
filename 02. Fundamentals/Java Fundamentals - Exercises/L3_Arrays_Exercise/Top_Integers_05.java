package Arrays_Exercise_03;

import java.util.Arrays;
import java.util.Scanner;

public class Top_Integers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] <= numbers[j]) {
                    break;
                } else {
                    System.out.print(numbers[i] + " ");
                    break;
                }
            }
        }
        System.out.print(numbers[numbers.length - 1]);
    }
}