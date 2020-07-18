package While_Loop_Lab_05;

import java.util.Scanner;

public class Sum_Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        while (num > sum) {
            int add = Integer.parseInt(scanner.nextLine());
            sum += add;
        }

        System.out.println(sum);
    }
}
