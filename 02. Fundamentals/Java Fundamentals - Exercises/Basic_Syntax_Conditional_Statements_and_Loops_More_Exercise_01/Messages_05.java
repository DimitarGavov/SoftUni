package Basic_Syntax_Conditional_Statements_and_Loops_More_Exercise_01;

import java.util.Scanner;

public class Messages_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < size; i++) {
            String num_str = scanner.nextLine();
            int len = num_str.length();
            int main_digit = Character.getNumericValue(num_str.charAt(0));
            int offset = 0;
            if (main_digit == 8 || main_digit == 9) {
                offset = (main_digit - 2) * 3 + 1;
            } else {
                offset = (main_digit - 2) * 3;
            }
            int letter_index = (offset + len - 1) + 97;
            if (main_digit == 0) {
                letter_index = 32;
            }
            word.append((char) letter_index);
        }

        System.out.println(word);

    }
}
