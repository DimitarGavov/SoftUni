package Data_Types_and_Variables_Lab_02;

import java.util.Scanner;

public class Chars_to_String_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = scanner.next().charAt(0);
        char b = scanner.next().charAt(0);
        char c = scanner.next().charAt(0);

        System.out.println("" + a + b + c);
    }
}
