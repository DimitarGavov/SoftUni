package While_Loop_Lab_05;

import java.util.Scanner;

public class Moving_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int l = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        int max = l * m * h;
        int need_to_move = 0;

        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            need_to_move += Integer.parseInt(input);
            if (max < need_to_move) {
                System.out.printf("No more free space! You need %d Cubic meters more.", need_to_move - max);
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Done")) {
            System.out.printf("%d Cubic meters left.", max - need_to_move);
        }
    }
}
