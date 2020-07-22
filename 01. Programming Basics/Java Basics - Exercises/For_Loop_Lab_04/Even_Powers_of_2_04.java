package For_Loop_Lab_04;

import java.util.Scanner;

public class Even_Powers_of_2_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int num = 0;

        while (num <= n) {
            System.out.println((int)Math.pow(2, num));
            num = num + 2;
        }
    }
}
