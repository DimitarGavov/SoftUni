package Data_Types_and_Variables_Exercise_02;

import java.util.Scanner;

public class Sum_of_Chars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < num; i++) {
            char ch = scanner.next().charAt(0);
            sum += (int) ch;
        }

        System.out.printf("The sum equals: %d", sum);
    }
}
