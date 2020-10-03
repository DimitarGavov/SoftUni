package Data_Types_and_Variables_Exercise_02;

import java.util.Scanner;

public class Triples_of_Latin_Letters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.printf("%s%s%s%n", (char) ('a' + i), (char) ('a' + j), (char) ('a' + k));
                }
            }
        }
    }
}
