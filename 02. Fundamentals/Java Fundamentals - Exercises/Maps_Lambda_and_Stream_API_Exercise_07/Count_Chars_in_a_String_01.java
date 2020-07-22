package Maps_Lambda_and_Stream_API_Exercise_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Count_Chars_in_a_String_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String input = String.join("", reader.readLine().split("\\s+"));
        HashMap<Character, Integer> occurance = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);

            if (occurance.containsKey(character)) {
                occurance.put(character, occurance.get(character) + 1);
            } else {
                occurance.put(character, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : occurance.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
