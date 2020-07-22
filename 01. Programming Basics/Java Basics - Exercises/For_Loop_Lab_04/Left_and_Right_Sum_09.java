package For_Loop_Lab_04;

import java.util.Scanner;

public class Left_and_Right_Sum_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int left_sum = 0;
        int right_sum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            left_sum += num;
        }

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            right_sum += num;
        }

        if (left_sum == right_sum) {
            System.out.printf("Yes, sum = %d", left_sum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(left_sum - right_sum));
        }
    }
}
