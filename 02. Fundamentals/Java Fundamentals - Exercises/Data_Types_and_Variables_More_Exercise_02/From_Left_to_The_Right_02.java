package Data_Types_and_Variables_More_Exercise_02;

import java.math.BigInteger;
import java.util.Scanner;

public class From_Left_to_The_Right_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String first_str = input.substring(0, input.indexOf(" "));
            String second_str = input.substring(input.indexOf(" ") +1);

            BigInteger first_num = new BigInteger(first_str);
            BigInteger second_num = new BigInteger(second_str);

            int sum = 0;
            BigInteger bigger = second_num;

            if (first_num.compareTo(second_num) > 0) bigger = first_num;
            String big_str = "" + bigger.abs();

            for (int j = 0; j < big_str.length(); j++) {
                sum += Character.getNumericValue(big_str.charAt(j));
            }

            System.out.println(sum);
        }
    }
}
