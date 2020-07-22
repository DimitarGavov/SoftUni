package Arrays_Lab_03;

import java.util.Arrays;
import java.util.Scanner;

public class Equal_Arrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] first = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] second = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean bool = false;
        int index = -1;
        int sum = 0;

        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                bool = true;
                index = i;
                break;
            }else {
                sum += first[i];
            }
        }
        if (bool) {
            System.out.printf("Arrays are not identical. Found difference at %d index.", index);
        }else {
            System.out.println("Arrays are identical. Sum: " + sum);
        }
    }
}
