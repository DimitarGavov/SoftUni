package Methods_Exercise_04;

import java.util.Scanner;

public class Vowels_Count_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        vowelsCount(input);
    }

    private static void vowelsCount(String input) {
        int vowelsCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if ("AEOUIaeoui".contains(input.charAt(i) + "")) {
                vowelsCount++;
            }
        }
        System.out.println(vowelsCount);
    }
}
