package Methods_Lab_04;

import java.util.Scanner;

public class Repeat_String_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int repeat = Integer.parseInt(scanner.nextLine());

        System.out.println(RepeatString(str, repeat));
    }

    private static String RepeatString(String str, int repeat) {
        String repeatResult = "";
        for (int i = 0; i < repeat; i++) {
            repeatResult += ReadTheString(str);
        }
        return repeatResult;
    }
    private static String ReadTheString(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i);
        }
        return result;
    }
}
