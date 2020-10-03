package Lists_Exercise_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Change_List_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] token = input.split("\\s+");
            String command = token[0];
            int element = Integer.parseInt(token[1]);
            switch (command) {
                case "Delete":
                    numbers = numbers
                            .stream()
                            .filter(item -> !(item == element))
                            .collect(Collectors.toList());
                    break;
                case "Insert":
                    int position = Integer.parseInt(token[2]);
                    if (position >= 0 && position < numbers.size()) {
                        numbers.add(position, element);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        numbers.forEach(item -> System.out.print(item + " "));
    }
}
