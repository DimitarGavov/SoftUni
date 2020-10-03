package Arrays_Lab_03;

import java.util.Scanner;

public class Numbers_in_Reverse_Order_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int[] nums = new int[number];

        for (int i = 0; i < number; i++) {
            nums[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = nums.length; i > 0; i--) {
            System.out.print(nums[i-1] + " ");
        }
    }
}
