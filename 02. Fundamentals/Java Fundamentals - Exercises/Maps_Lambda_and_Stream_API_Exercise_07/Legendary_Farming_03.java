package Maps_Lambda_and_Stream_API_Exercise_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Legendary_Farming_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        LinkedHashMap<String, Integer> keyMaterials = new LinkedHashMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);
        TreeMap<String, Integer> junkItems= new TreeMap<>();
        String winner = "";
        boolean flag = false;

        do {
            String[] data = reader.readLine().split("\\s+");

            for (int i = 0; i < data.length; i += 2) {
                int quantity = Integer.parseInt(data[i]);
                String material = data[i + 1].toLowerCase();

                if (!keyMaterials.containsKey(material)) {
                    if (!junkItems.containsKey(material)) {
                        junkItems.put(material, quantity);
                    } else {
                        junkItems.put(material, junkItems.get(material) + quantity);
                    }
                } else {
                    keyMaterials.put(material, keyMaterials.get(material) + quantity);

                    if (keyMaterials.get(material) >= 250) {
                        keyMaterials.put(material, keyMaterials.get(material) - 250);

                        winner = material;
                        flag = true;
                        break;
                    }
                }
            }
        } while (!flag);

        if (winner.equals("shards")) {
            System.out.println("Shadowmourne obtained!");
        } else if (winner.equals("motes")) {
            System.out.println("Dragonwrath obtained!");
        } else {
            System.out.println("Valanyr obtained!");
        }

        keyMaterials.entrySet().stream().sorted((e1, e2) -> {
                    int sort = Integer.compare(e2.getValue(), e1.getValue());
                    if (sort == 0) sort = e1.getKey().compareTo(e2.getKey());
                    return sort;
                })
                .forEach(e -> {
            System.out.println(String.format("%s: %d", e.getKey(), e.getValue()));
        });

        junkItems.forEach((key, value) -> System.out.println(String.format("%s: %d", key, value)));
    }
}
