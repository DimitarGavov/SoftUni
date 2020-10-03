package Arrays_Lab_03;

import java.util.Arrays;
import java.util.Scanner;

public class Even_and_Odd_Subtraction_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int even = 0;
        int odd = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even += numbers[i];
            }else {
                odd += numbers[i];
            }
        }
        System.out.println(even - odd);
    }
}
