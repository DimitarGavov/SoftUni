package Arrays_Lab_03;

import java.util.Arrays;
import java.util.Scanner;

public class Condense_Array_to_Number_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j + 1 < nums.length) {
                    nums[j] = nums[j] + nums[j + 1];
                }
            }
        }
        System.out.println(nums[0]);
    }
}
