package Lists_Exercise_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class House_Party_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        List<String> guests = new ArrayList<>();

        for (int i = 0; i < numberOfCommands; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            String ifItIs = input[1] + " " + input[2];
            if (ifItIs.equals("is going!")) {
                if (guests.contains(name)) {
                    System.out.println(String.format("%s is already in the list!", name));
                } else {
                    guests.add(name);
                }
            } else if (ifItIs.equals("is not")) {
                if (guests.contains(name)) {
                    guests.remove(name);
                } else {
                    System.out.println(String.format("%s is not in the list!", name));
                }
            }
        }
        guests.forEach(item -> System.out.println(item + " "));
    }
}
