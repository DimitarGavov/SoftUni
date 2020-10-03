package Lists_Lab_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class List_of_Products_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfProducts = Integer.parseInt(scanner.nextLine());

        List<String> products = new ArrayList<>();

        for (int i = 0; i < numberOfProducts; i++) {
            products.add(scanner.nextLine());
        }
        Collections.sort(products);

        for (int i = 0; i < products.size(); i++) {
            System.out.println(String.format("%d.%s", i + 1, products.get(i)));
        }
    }
}
