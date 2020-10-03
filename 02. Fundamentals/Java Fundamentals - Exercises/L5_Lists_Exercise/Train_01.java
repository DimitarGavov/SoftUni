package Lists_Exercise_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] token = input.split(" ");
            if (token[0].equals("Add")) {
                int newWagon = Integer.parseInt(token[1]);
                wagons.add(newWagon);
            } else {
                int numberOfPeople = Integer.parseInt(token[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    if (maxCapacity - wagons.get(i) < numberOfPeople) {
                        continue;
                    } else {
                        wagons.set(i, wagons.get(i) + numberOfPeople);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        wagons.forEach(item -> System.out.print(item + " "));
    }
}
