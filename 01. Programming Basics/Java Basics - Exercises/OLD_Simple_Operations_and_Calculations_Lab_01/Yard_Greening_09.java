package OLD_Simple_Operations_and_Calculations_Lab_01;

import java.util.Scanner;

public class Yard_Greening_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kv_mtr = Double.parseDouble(scanner.nextLine());

        double discount = kv_mtr * 7.61 * 0.18;
        double final_price = kv_mtr * 7.61 * 0.82;

        System.out.printf("The final price is: %.2f lv.%n", final_price);
        System.out.printf("The discount is:%.2f lv.", discount);
    }
}
