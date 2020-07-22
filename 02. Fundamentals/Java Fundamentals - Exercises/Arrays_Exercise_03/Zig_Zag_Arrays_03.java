package Arrays_Exercise_03;

import java.util.Arrays;
import java.util.Scanner;

public class Zig_Zag_Arrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfArrays = Integer.parseInt(scanner.nextLine());
        int[] firstArray = new int[numberOfArrays];
        int[] secondArray = new int[numberOfArrays];

        for (int i = 0; i < numberOfArrays; i++) {
            int[] numbArray = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            if (i % 2 == 0) {
                firstArray[i] = numbArray[0];
                secondArray[i] = numbArray[1];
            } else {
                firstArray[i] = numbArray[1];
                secondArray[i] = numbArray[0];
            }
        }
        for (int i = 0; i < numberOfArrays; i++) {
            System.out.print(firstArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < numberOfArrays; i++) {
            System.out.print(secondArray[i] + " ");
        }
    }
}
