package Arrays_Exercise_03;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] indexesOfTheLadybugs = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] ladybugs = new int[fieldSize];

        for (int i = 0; i < indexesOfTheLadybugs.length; i++) {
            int currentindex = indexesOfTheLadybugs[i];
            if (currentindex >= 0 && currentindex < fieldSize) {
                ladybugs[currentindex] = 1;
            }
        }

        String input = "";

        while (!"end".equals(input = scanner.nextLine())) {
            boolean isFirst = true;

            String[] command = input.split(" ");
            int ladybugIndex = Integer.parseInt(command[0]);

            while (ladybugIndex >= 0 && ladybugIndex < fieldSize && ladybugs[ladybugIndex] != 0) {
                if (isFirst) {
                    ladybugs[ladybugIndex] = 0;
                    isFirst = false;
                }
                String direction = command[1];
                int flyLength = Integer.parseInt(command[2]);

                if (direction.equals("left")) {
                    ladybugIndex -= flyLength;

                    if (ladybugIndex >= 0 && ladybugIndex < fieldSize) {
                        if (ladybugs[ladybugIndex] == 0) {
                            ladybugs[ladybugIndex] = 1;
                            break;
                        }
                    }
                } else {
                    ladybugIndex += flyLength;

                    if (ladybugIndex >= 0 && ladybugIndex < fieldSize) {
                        if (ladybugs[ladybugIndex] == 0) {
                            ladybugs[ladybugIndex] = 1;
                            break;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < ladybugs.length; i++) {
            System.out.print(ladybugs[i] + " ");
        }
    }
}