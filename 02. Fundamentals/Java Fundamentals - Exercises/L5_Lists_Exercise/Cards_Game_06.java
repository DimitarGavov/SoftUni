package Lists_Exercise_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Cards_Game_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondPlayerCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (!(firstPlayerCards.isEmpty() || secondPlayerCards.isEmpty())) {
            if (firstPlayerCards.get(0) > secondPlayerCards.get(0)) {
                firstPlayerCards.add(firstPlayerCards.get(0));
                firstPlayerCards.remove(0);
                firstPlayerCards.add(secondPlayerCards.get(0));
                secondPlayerCards.remove(0);
            } else if (firstPlayerCards.get(0) < secondPlayerCards.get(0)) {
                secondPlayerCards.add(secondPlayerCards.get(0));
                secondPlayerCards.remove(0);
                secondPlayerCards.add(firstPlayerCards.get(0));
                firstPlayerCards.remove(0);
            } else {
                firstPlayerCards.remove(0);
                secondPlayerCards.remove(0);
            }
        }
        String isEmpty = "";
        int sum = 0;

        if (secondPlayerCards.isEmpty()) {
            for (int i = 0; i < firstPlayerCards.size(); i++) {
                sum += firstPlayerCards.get(i);
            }
            isEmpty = "First";
        } else {
            for (int i = 0; i < secondPlayerCards.size(); i++) {
                sum += secondPlayerCards.get(i);
            }
            isEmpty = "Second";
        }
        System.out.println(String.format("%s player wins! Sum: %d", isEmpty, sum));
    }
}
