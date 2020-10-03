package Maps_Lambda_and_Stream_API_Exercise_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class A_Miner_Task_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        LinkedHashMap<String, Integer> mineResources = new LinkedHashMap<>();

        String input = "";

        while (!"stop".equals(input = reader.readLine())) {
            String resource = input;
            int quantity = Integer.parseInt(reader.readLine());

            if (!mineResources.containsKey(resource)) {
                mineResources.put(resource, quantity);
            } else {
                mineResources.put(resource, mineResources.get(resource) + quantity);
            }
        }
        mineResources.entrySet().forEach(e -> System.out.printf("%s -> %d\n", e.getKey(), e.getValue()));
    }
}
