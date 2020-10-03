package Data_Types_and_Variables_Exercise_02;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        long best_snowballValue = Integer.MIN_VALUE;
        String result = "";

        for (int i = 0; i < n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            if (snowballTime != 0) {
                long snowballValue = (long) Math.pow(snowballSnow * 1.0 / snowballTime, snowballQuality);
                if (best_snowballValue <= snowballValue) {
                    best_snowballValue = snowballValue;
                    result = snowballSnow + " : " + snowballTime + " = " + snowballValue + " (" + snowballQuality + ")";
                }
            }
        }
        System.out.println(result);
    }
}
