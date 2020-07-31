package Arrays_Exercise_03.test;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(scanner.nextLine());
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
