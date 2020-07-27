package Data_Types_and_Variables_Exercise_02;

import java.util.Scanner;

public class Water_Overflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int liters = Integer.parseInt(scanner.nextLine());
            sum += liters;
            if (sum > 255) {
                System.out.println("Insufficient capacity!");
                sum -= liters;
            }
        }
        System.out.println(sum);
    }
}
