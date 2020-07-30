package Data_Types_and_Variables_More_Exercise_02;

import java.math.BigDecimal;
import java.util.Scanner;

public class Floating_Equality_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal num1 = new BigDecimal(scanner.nextLine());
        BigDecimal num2 = new BigDecimal(scanner.nextLine());
        BigDecimal diff = num1.subtract(num2).abs();
        BigDecimal eps = new BigDecimal("0.000001");

        if (diff.compareTo(eps) < 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
