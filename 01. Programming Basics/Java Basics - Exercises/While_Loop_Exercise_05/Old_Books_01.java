package While_Loop_Exercise_05;

import java.util.Scanner;

public class Old_Books_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String looked_book = scanner.nextLine();

        String input = scanner.nextLine();
        int count = 0;

        while (!(input.equals(looked_book) || input.equals("No More Books"))) {
            count++;
            input = scanner.nextLine();
        }

        if (input.equals(looked_book)) {
            System.out.printf("You checked %d books and found it.", count);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", count);
        }
    }
}
