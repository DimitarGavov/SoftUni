package Maps_Lambda_and_Stream_API_Exercise_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class Orders_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, Double> products = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> buyProducts = new LinkedHashMap<>();

        String input = "";

        while (!"buy".equals(input = reader.readLine())) {
            String[] productInfo = input.split("\\s+");

            String product = productInfo[0];
            double price = Double.parseDouble(productInfo[1]);
            int quantity = Integer.parseInt(productInfo[2]);

            if (!products.containsKey(product)) {
                products.put(product, quantity * price);
                buyProducts.put(product, quantity);
            } else {
                buyProducts.put(product, buyProducts.get(product) + quantity);
                products.put(product, buyProducts.get(product) * price);
            }
        }
        products.forEach((key, value) -> System.out.println(String.format("%s -> %.2f", key, value)));
    }
}
