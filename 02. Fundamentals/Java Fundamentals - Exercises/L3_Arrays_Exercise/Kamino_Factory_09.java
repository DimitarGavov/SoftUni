package Arrays_Exercise_03;

import java.util.Arrays;
import java.util.Scanner;

public class Kamino_Factory_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        String input = "";

        int bestIndex = Integer.MAX_VALUE;
        int bestSum = 0;
        int bestValue = 0;
        int bestOutput = 0;
        String output = "";

        while (!"Clone them!".equals(input = scanner.nextLine())) {
            ++bestValue;
            String[] data = Arrays.stream(input.split("[!]"))
                    .filter(e -> !e.equals(""))
                    .toArray(String[]::new);

            int[] sequenceDNA = new int[size];

            for (int i = 0; i < data.length; i++) {
                sequenceDNA[i] = Integer.parseInt(data[i]);
            }
            int max = 0;
            int index = 0;
            for (int i = 0; i < sequenceDNA.length; i++) {
                int current = 0;
                for (int j = i; j < sequenceDNA.length; j++) {
                    if (sequenceDNA[i] == sequenceDNA[j]) {
                        current++;
                        if (current > max) {
                            max = current;
                            index = i;
                        }
                    }else {
                        break;
                    }
                }
            }

            int sum = 0;
            for (int i = 0; i < sequenceDNA.length; i++) {
                sum += sequenceDNA[i];
            }
            if (index < bestIndex || sum > bestSum) {
                output = "";
                bestIndex = index;
                bestSum = sum;
                bestOutput = bestValue;
                for (int i = 0; i < sequenceDNA.length; i++) {
                    output += sequenceDNA[i] + " ";
                }
            }
        }
        System.out.println(String.format("Best DNA sample %d with sum: %d.", bestOutput, bestSum));
        System.out.println(output.trim());
    }
}
