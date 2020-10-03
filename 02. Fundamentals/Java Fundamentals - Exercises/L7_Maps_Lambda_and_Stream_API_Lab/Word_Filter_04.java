package Maps_Lambda_and_Stream_API_Lab_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Word_Filter_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );
        String[] input = Arrays.stream(reader.readLine().split("\\s+"))
                .filter(w -> w.length() % 2 == 0)
                .toArray(String[]::new);

        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }
}
