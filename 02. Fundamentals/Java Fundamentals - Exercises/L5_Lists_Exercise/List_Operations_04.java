package Lists_Exercise_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class List_Operations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = "";

        while (!"End".equals(input = scanner.nextLine())) {
            String[] token = input.split(" ");
            String command = token[0];
            switch (command) {
                case "Add":
                    int number = Integer.parseInt(token[1]);
                    numbers.add(number);
                    break;
                case "Insert":
                    int element = Integer.parseInt(token[1]);
                    int index = Integer.parseInt(token[2]);
                    if (index >= 0 && index < numbers.size()) {
                        numbers.add(index, element);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int removeIndex = Integer.parseInt(token[1]);
                    if (removeIndex >= 0 && removeIndex < numbers.size()) {
                        numbers.remove(removeIndex);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String side = token[1];
                    int count = Integer.parseInt(token[2]);
                    for (int i = 0; i < count; i++) {
                        if (side.equals("left")) {
                            numbers.add(numbers.get(0));
                            numbers.remove(0);
                        } else if (side.equals("right")) {
                            numbers.add(0, numbers.get(numbers.size() - 1));
                            numbers.remove(numbers.size() - 1);
                        }
                    }
                    break;
            }
        }
        numbers.forEach(item -> System.out.print(item + " "));
    }
}
