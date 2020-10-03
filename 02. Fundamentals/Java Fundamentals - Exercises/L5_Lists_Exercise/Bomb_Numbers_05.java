package Lists_Exercise_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bomb_Numbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int bombNumber = scanner.nextInt();
        int bombPower = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == bombNumber) {
                int startIndex = i - bombPower;
                int endIndex = i + bombPower;

                if (endIndex < 0 || startIndex >= numbers.size()) {
                    continue;
                } else if (startIndex < 0) {
                    startIndex = 0;
                    if (endIndex >= numbers.size()) {
                        endIndex = numbers.size() - 1;
                    }
                } else if (endIndex >= numbers.size()) {
                    endIndex = numbers.size() - 1;
                    if (startIndex < 0) {
                        startIndex = 0;
                    }
                }
                for (int j = endIndex; j >= startIndex; j--) {
                    if (numbers.contains(numbers.get(j)) && j != numbers.indexOf(bombNumber)) {
                        numbers.set(j, 0);
                    }
                }
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == bombNumber) {
                numbers.set(numbers.indexOf(bombNumber), 0);
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println(sum);
    }
}
