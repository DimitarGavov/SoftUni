package Lists_Exercise_05;

import java.util.*;
import java.util.stream.Collectors;

public class Append_Arrays_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split("\\|+"))
        .collect(Collectors.toList());

        List<String> output = new ArrayList<>();
        Collections.reverse(input);

        for (int i = 0; i < input.size(); i++) {
            List<String> listinArray = Arrays.stream(input.get(i).split(" "))
                    .collect(Collectors.toList());
            for (int j = 0; j < listinArray.size(); j++) {
                if (!listinArray.get(j).equals("")) {
                    output.add(listinArray.get(j));
                }
            }
        }
        System.out.println();
        for (int i = 0; i < output.size(); i++) {
            System.out.print(output.get(i) + " ");
        }
    }
}
