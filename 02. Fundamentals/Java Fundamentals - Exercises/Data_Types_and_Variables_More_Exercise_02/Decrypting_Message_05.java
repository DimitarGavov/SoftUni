package Data_Types_and_Variables_More_Exercise_02;

import java.util.Scanner;

public class Decrypting_Message_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char ch = scanner.next().charAt(0);
            result.append(Character.toString((char) ch + key));
        }
        System.out.println(result);
    }
}
