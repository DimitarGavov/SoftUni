package For_Loop_Lab_04;

import java.util.Scanner;

public class Odd_Even_Sum_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int odd_sum = 0;
        int even_sum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                even_sum += num;
            } else {
                odd_sum += num;
            }
        }

        if (even_sum - odd_sum == 0) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", even_sum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(even_sum - odd_sum));
        }
    }
}
