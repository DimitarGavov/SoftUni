package Arrays_Exercise_03;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Rotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rotationNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotationNumber % numbers.length; i++) {
            int helpNumber = numbers[0];
            for (int j = 1; j < numbers.length; j++) {
                numbers[j - 1] = numbers[j];
            }
            numbers[numbers.length - 1] = helpNumber;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
