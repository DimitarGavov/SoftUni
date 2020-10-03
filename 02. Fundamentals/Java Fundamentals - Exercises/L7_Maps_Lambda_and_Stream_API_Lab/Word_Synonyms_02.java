package Maps_Lambda_and_Stream_API_Lab_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Word_Synonyms_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        LinkedHashMap<String, ArrayList<String>> words = new LinkedHashMap<>();

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String word = reader.readLine();
            String synonym = reader.readLine();

            words.putIfAbsent(word, new ArrayList<>());
            words.get(word).add(synonym);
        }

        String pattern = "%s - %s";
        for (Map.Entry<String, ArrayList<String>> entry : words.entrySet() ) {

            String key = entry.getKey();
            String value = String.join(", ", entry.getValue());
            System.out.println(String.format(pattern, key, value));
        }
    }
}
