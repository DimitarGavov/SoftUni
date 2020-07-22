package While_Loop_Lab_05;

import java.util.Scanner;

public class Password_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String pass = scanner.nextLine();
        String guess = scanner.nextLine();

        while (!guess.equals(pass)) {
            guess = scanner.nextLine();
        }

        System.out.printf("Welcome %s!", name);
    }
}
