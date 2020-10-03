package Methods_Lab_04;

import java.util.Scanner;

public class Greater_of_Two_Values_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeInput = scanner.nextLine();
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        System.out.println(getMax(first, second));
    }

    private static int getMax(int first, int second) {
        return Math.max(first, second);
    }

    private static char getMax(char first, char second) {
         return (char)Character.compare(first, second);
    }

    private static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        } else {
            return second;
        }
    }
}
