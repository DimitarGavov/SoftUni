package Data_Types_and_Variables_Exercise_02;

import java.util.Scanner;

public class Sum_Digits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        String str_num = String.valueOf(num);
        int sum = 0;

        for (int i = 0; i < str_num.length(); i++) {
            sum += Character.getNumericValue(str_num.charAt(i));
        }

        System.out.println(sum);
    }
}
