package Maps_Lambda_and_Stream_API_Lab_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Largest_3_Numbers_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        List<Integer> numbers = Arrays.stream(reader.readLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted((g1, g2) -> Integer.compare(g2,g1))
                .limit(3)
                .collect(Collectors.toList());

        for (Integer number : numbers) System.out.print(number + " ");
    }
}
