package Data_Types_and_Variables_More_Exercise_02;

import java.util.Scanner;

public class Balanced_Brackets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean isLeft = false;
        boolean isBalanced = true;

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            if (input.equals("(")) {
                if (isLeft) {
                    isBalanced = false;
                } else {
                    isLeft = true;
                }
            }

            if (input.equals(")")) {
                if (!isLeft) {
                    isBalanced = false;
                } else {
                    isLeft = false;
                }
            }
        }

        if (isBalanced && !isLeft) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
