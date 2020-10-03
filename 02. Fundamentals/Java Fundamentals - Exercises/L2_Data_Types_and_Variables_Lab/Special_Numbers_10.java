package Data_Types_and_Variables_Lab_02;

import java.util.Scanner;

public class Special_Numbers_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String str_i = "" + i;
            int sum = 0;
            for (int j = 0; j < str_i.length(); j++) {
                sum += Integer.parseInt(String.valueOf(str_i.charAt(j)));
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }
    }
}
