package While_Loop_Lab_05;

import java.util.Scanner;

public class Sequence_2k_plus_1_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int start = 1;

        while (start <= n) {
            System.out.println(start);
            start = 2 * start + 1;
        }
    }
}
