package OLD_Simple_Operations_and_Calculations_Lab_01;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int num = 1;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(num+ " ");
                num++;
                if (num > n) {
                    break;
                }
            }
            System.out.println();
            if (num > n) {
                break;
            }
        }
    }
}
