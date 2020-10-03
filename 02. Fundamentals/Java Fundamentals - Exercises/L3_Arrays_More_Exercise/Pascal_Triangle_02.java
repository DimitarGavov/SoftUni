package Arrays_More_Exercise_03;

import java.util.Scanner;

public class Pascal_Triangle_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magicNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < magicNumber; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
