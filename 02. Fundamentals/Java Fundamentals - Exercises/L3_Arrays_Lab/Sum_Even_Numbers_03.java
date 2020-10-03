package Arrays_Lab_03;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_Even_Numbers_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;

        for (int numb : numbers) {
            if (numb % 2 == 0) {
                sum += numb;
            }
        }

        System.out.println(sum);
    }
}
