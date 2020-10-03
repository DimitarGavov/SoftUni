package Objects_and_Classes_Exercise_06.Articles_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split(", ");
        Commands commands = new Commands(data[0], data[1], data[2]);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(": ");
            String command = input[0];

            switch (command) {
                case "Edit":
                    commands.edit(input[1]);
                    break;
                case "ChangeAuthor":
                    commands.changeAuthor(input[1]);
                    break;
                case "Rename":
                    commands.rename(input[1]);
                    break;

            }
        }
        System.out.println(commands);
    }
}
