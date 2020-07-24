package Basic_Syntax_Conditional_Statements_and_Loops_Exercise_01;

import java.util.Scanner;

public class Strong_Number_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        String str_num = String.valueOf(num);

        int sum = 0;

        for (int i = 0; i < str_num.length(); i++) {
            int value_fct = 1;
            int current_num = Character.getNumericValue(str_num.charAt(i));
            if (current_num == 0) {
                sum += value_fct;
                continue;
            }
            for (int j = 1; j <= current_num; j++) {
                value_fct *= j;
            }
            sum += value_fct;
        }
        if (sum == num) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
