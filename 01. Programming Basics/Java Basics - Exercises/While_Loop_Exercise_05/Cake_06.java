package While_Loop_Exercise_05;

import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        int cake = m * n;
        String input = "";

        while (!(cake <= 0 || "STOP".equals(input = scanner.nextLine()))) {
            int piece_of_cake = Integer.parseInt(input);
            cake -= piece_of_cake;
        }

        if (input.equals("STOP")) {
            System.out.printf("%d pieces are left.", cake);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cake));
        }
    }
}
