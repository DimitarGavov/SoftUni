package Lists_Lab_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class List_Manipulation_Basics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] commandLine = input.split(" ");
            String command = commandLine[0];
            int number = Integer.parseInt(commandLine[1]);
            switch (command) {
                case "Add":
                    numbers.add(number);
                    break;
                case "Remove":
                    numbers.remove(numbers.indexOf(number));
                    break;
                case "RemoveAt":
                    numbers.remove(number);
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandLine[2]);
                    numbers.add(index, number);
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
