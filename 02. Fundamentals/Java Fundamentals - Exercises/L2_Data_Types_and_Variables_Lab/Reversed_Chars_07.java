package Data_Types_and_Variables_Lab_02;

import java.util.Scanner;

public class Reversed_Chars_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = scanner.next().charAt(0);
        char b = scanner.next().charAt(0);
        char c = scanner.next().charAt(0);

        System.out.printf("%s %s %s", c, b, a);
    }
}
