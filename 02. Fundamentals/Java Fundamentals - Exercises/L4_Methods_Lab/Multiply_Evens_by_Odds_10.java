package Methods_Lab_04;

import java.util.Scanner;

public class Multiply_Evens_by_Odds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(getMultipleOfEvensAndOdds(number));
    }

    private static int getMultipleOfEvensAndOdds(int number) {
        int evenSum = getSumOfEvenDigits(number);
        int oddSum = getSumOfOddDigits(number);

        return evenSum * oddSum;
    }

    private static int getSumOfOddDigits(int number) {
        int oddSum = 0;
        while (number != 0) {
            if (Math.abs(number % 10) % 2 != 0) {
                oddSum += number % 10;
            }
            number /= 10;
        }
        return oddSum;
    }

    private static int getSumOfEvenDigits(int number) {
        int evenSum = 0;
        while (number != 0) {
            if (Math.abs(number % 10) % 2 == 0) {
                evenSum += number % 10;
            }
            number /= 10;
        }
        return evenSum;
    }
}
